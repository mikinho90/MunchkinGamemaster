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
}
