package MGM.backend;

public class Player {
	
	private String name;
	private Integer level;
	private Integer boni;

	public Player(String name) {
		this.name = name;
		this.level = 1;
		this.boni = 0;
	}

	public String getName() {
		return this.name;
	}

	public Integer getLevel() {
		return this.level;
	}

	public Integer levelUP(){
		this.level++;
		return level;
	}
	
	public Integer levelDOWN(){
		this.level--;
		return level;
	}

	public Integer getBoni() {
		return this.boni;
	}
	
	public Integer boniUP(){
		this.boni++;
		return this.boni;
	}
	
	public Integer boniDOWN(){
		this.boni--;
		return this.boni;
	}

	public Integer getPower(){
		return level+boni;
	}
	

}
