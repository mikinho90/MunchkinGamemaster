package MGM.backend;

public class Monster {
	
	private Integer power;
	private Integer loot;
	private Integer xp;

	public Monster() {
		resetMonster();
	}

	public Integer getPower() {
		return power;
	}

	public Integer getLoot() {
		return loot;
	}

	public Integer getXP() {
		return xp;
	}
	
	public void resetMonster(){
		this.power = 0;
		this.loot = 0;
		this.xp = 0;
	}
	
	public Integer powerUP(){
		this.power++;
		return power;
	}
	
	public Integer powerUP5(){
		this.power+=5;
		return power;
	}
	
	public Integer powerUP10(){
		this.power+=10;
		return power;
	}
	
	public Integer powerUP20(){
		this.power+=20;
		return power;
	}
	
	public Integer powerDOWN(){
		this.power--;
		return power;
	}
	
	public Integer lootUP(){
		this.loot++;
		return loot;
	}
	
	public Integer lootDOWN(){
		this.loot--;
		return loot;
	}
	
	

}
