package quiz17;

public class BugsMusic implements SongList{
	
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
		for(String song : list) {
			System.out.println(song);
		}
	}
	@Override
	public int playLength() {
		// TODO Auto-generated method stub
		return count;
	}
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로~
	 * 
	 */
	
}
