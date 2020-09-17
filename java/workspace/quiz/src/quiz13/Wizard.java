package quiz13;

public class Wizard extends Player{
	
	public Wizard(String name) {
		this.name = name;
		hp = 500;
		mp = 1000;
		attack = 5;
	}
	
	void iceArrow(Player p) {
		if(mp < 100) {
			System.out.println("mp가 부족합니다.");
			return;
		}
		
		if(p instanceof Wizard) {
			Wizard w = (Wizard)p;
			w.hp -= 100;
		} else if (p instanceof Warrior) {
			Warrior w = (Warrior)p;
			w.hp -= 200;
		}
		
		mp -= 100;
		System.out.println("Ice Arrow~~~~~");
	}
	
	public void blizzard(Player[] players) {
		System.out.println("--------------------------");
		System.out.println(this.name + "님의 눈보라 시전!");
		
		for(Player player: players) {
			int damage = (int)(Math.random()*6) + 10;
			
			player.hp -= damage;
			System.out.println(player.name + "님이 " + damage + "만큼 피해를 입었습니다.");
		}
	}
}
