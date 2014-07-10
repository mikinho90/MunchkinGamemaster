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

	public void levelUP(){
		this.level++;
	}
	
	public void levelDOWN(){
		this.level--;
	}

	public Integer getBoni() {
		return this.boni;
	}
	
	public void boniUP(){
		this.boni++;
	}
	
	public void boniDOWN(){
		this.boni--;
	}

	

}
