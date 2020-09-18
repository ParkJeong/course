package quiz15;

public class Dropship extends Unit{
	public Unit[] units = new Unit[8]; // 수송선의 공간
	public int index = 0; // unit배열의 index
	
	public Dropship() {
		super(0, 0, 200);
		// TODO Auto-generated constructor stub
	}

	/*
	 * location()의 기능은 동일함
	 */
	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("x: " + this.getX() + ", y: " + this.getY());
		
	}

	/*
	 * move()는 마린과 동일
	 * 단, 수송선이 이동하면, 수송선 배열에 있는 모든 유닛의 위치가 수송선 위치로 바뀐다.
	 */
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		int distanceX = Math.abs(x - this.getX());
		int distanceY = Math.abs(y - this.getY());
		
		this.setX(x);
		this.setY(y);
		
		for(int i = 0; i < index; i++) {
			if(units[i] == null) continue;
			units[i].setX(x);
			units[i].setX(y);
		}
		
		System.out.println((int)Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2)));

	}
	
	/*
	 * ride(모든 유닛을 받을 수 있도록 선언)
	 * 1. 배열의 크기는 8이고, 수송선 배열에는 탱크와 마린이 탈 수 있다.
	 *    탱크는 배열을 4칸씩 사용한다. 마린은 배열을 1칸씩 사용
	 * 2. 배열에 유닛이 탈 수 있으면 배열에 유닛을 저장한다.
	 *    배열이 전부 차거나, 탈 수 있는 공간이 없으면 "공간이 부족합니다" 출력
	 * 3. 수송선에 탄 유닛을 가로로 출력하면 된다.
	 */
	
	public void ride(Unit unit) {
		if(unit instanceof Tank) {
			if(index > 4) {
				System.out.println("공간이 부족합니다.");
				return;				
			}
			units[index] = unit;
			index += 4;
			
		}
		else if (unit instanceof Marine) {
			if(index > 8) {
				System.out.println("공간이 부족합니다.");
				return;				
			}
			units[index] = unit;
			index += 1;
		}
		else {
			System.out.println("탈 수 없습니다.");
		}
	}

}
