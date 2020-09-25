package quiz24;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class MapQuiz01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("kim1234", "kkk1234");
		map.put("lee5678", "lll5678");
		map.put("park4321", "ppp4321");
		
		/*
		 * 1. id와 pw를 입력받아서 해당 아이디가 map에 존재하는지 확인
		 * 2. 존재하면 다시한번 비밀번호값과 비교해서, 비밀번호도 일치하면 "로그인성공" 콘솔에 출력
		 *    비밀번호가 다르다면 "비밀번호가 틀렸습니다" 를 출력
		 * 3. id가 맵에 존재하지 않으면 "아이디가 존재하지 않습니다"를 출력
		 */
		Scanner stdIn = new Scanner(System.in);
		
		String id = stdIn.next();
		
		if(map.containsKey(id)) {
			String password = stdIn.next();
			if(map.get(id).equals(password)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		} else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
	}
}
