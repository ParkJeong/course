package quiz29;

public class VideoThread extends Thread{
	@Override
	public void run() {
		System.out.print("동영상을 다운로드 합니다:");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("다운로드가 완료되었습니다.");
	}
}
