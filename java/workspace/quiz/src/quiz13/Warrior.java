package quiz13;

public class Warrior extends Player{
	
	// 1. 생성자 : name만 전달 받아서 hp = 1000, mp = 500
	// attack = 10으로 초기화
	// 2. bash 스킬은 player 타입을 받아서 각각의 직업에 따라
	// 해당 객체의 hp를 다르게 감소
	
	
	public Warrior(String name) {
		this.name = name;
		hp = 1000;
		mp = 500;
		attack = 10;
	}
	
	void bash(Player p) {
		if(mp < 100) {
			System.out.println("mp가 부족합니다.");
			return;
		}
		
		if(p instanceof Wizard) {
			Wizard w = (Wizard)p;
			w.hp -= 200;
		} else if (p instanceof Warrior) {
			Warrior w = (Warrior)p;
			w.hp -= 100;
		}
		
		mp -= 100;
		System.out.println("Bash~~~~~");
	}
}
