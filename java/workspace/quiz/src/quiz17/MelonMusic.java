package quiz17;

public class MelonMusic implements SongList {

	private String[] list = new String[100];
	private int count = 0;
	@Override
	public void insertList(String song) {
		// TODO Auto-generated method stub
		if(count == 100) {
			System.out.println("재생 목록이 가득찼습니다.");
			return;
		}
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
		// TODO Auto-generated method stub
		// int prevSong = 0;
		if(count == 0) {
			System.out.println("재생 목록이 없습니다.");
			return;
		}
		
		int randomSong = (int)(Math.random() * count);
		
		System.out.println("랜덤 재생: " + list[randomSong]);
		
	}
	@Override
	public int playLength() {
		// TODO Auto-generated method stub
		return count;
	}
	
	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */
	
	
}
