package quiz13;

public class MainClass {
	public static void main(String[] args) {
	
	Warrior me = new Warrior("강한친구대한전사");
		
	Warrior player1 = new Warrior("전사약해요");
	
	Wizard player2 = new Wizard("구르미그린마법사");
	
	System.out.println("----나의 캐릭 스킬 사용----");
	player1.info();
	me.bash(player1);
	player1.info();
	
	player2.info();
	me.bash(player2);
	player2.info();
	
	me.info();
	
	Player[] players = new Player[2];
	players[0] = me;
	players[1] = player1;
	
	Player[] players2 = {me, player1};
	
	for(int i = 0; i < 5; i++) {
		player2.blizzard(players);
	}
	}
}
