package MGM.backend;

public class CombatUtil {

	public CombatUtil() {
		// TODO Auto-generated constructor stub
	}

	
	public static Integer fight(Monster monster,Player player1){
		Integer result = player1.getPower()-monster.getPower();
		return result;
	}
	
	public static Integer fight(Monster monster,Player player1,Player player2){
		Integer result = (player1.getPower()+player2.getPower())-monster.getPower();
		return result;
	}
	/*
	public static void main(String[] args){
		Player p1 = new Player("hendrik");
		Player p2 = new Player("mike");
		Monster mon = new Monster();
		System.out.println(CombatUtil.fight(mon, p1));
		mon.powerUP();
		System.out.println(CombatUtil.fight(mon, p1));
		mon.powerUP10();
		System.out.println(CombatUtil.fight(mon, p1));
		p1.boniUP();
		p1.boniUP();
		p1.boniUP();
		p1.boniUP();
		p1.boniUP();
		p1.boniUP();
		p1.boniUP();
		p1.boniUP();
		p1.boniUP();
		p1.boniUP();
		p1.levelUP();
		p1.levelUP();
		p1.levelUP();
		p1.levelUP();
		p1.levelUP();
		p1.levelUP();	
		System.out.println(CombatUtil.fight(mon, p1));
		System.out.println(CombatUtil.fight(mon, p1,p2));	
	}
	*/
}
