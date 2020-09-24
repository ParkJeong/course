package quiz21;

import java.util.List;
import java.util.ArrayList;

class User {
	private String name;
	private int age;

	public User() {}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}

public class ArrayListQuiz02 {
	/*
	 * 1. User 클래스는 은닉된 변수로 name, age를 선언하고 생성
	 * 
	 * 2. User 클래스를 저장할 수 있는 List 생성 선언
	 * 
	 * 3. User 객체 2개를 생성해서 리스트에 추가하라.
	 * 
	 * 4. list에 저장된 모든 name, age를 반복문으로 출력
	 * 
	 * 5. list에 홍길자가 있다면 홍길자의 이름, 나이만 출력
	 * 
	 * 6. list에 홍길동이 있다면 홍길동 User 객체 삭제
	 */
	public static void main(String[] args) {

		List<User> userList = new ArrayList<User>();

		User user1 = new User("홍길자", 20);
		User user2 = new User("홍길동", 40);

		userList.add(user1);
		userList.add(user2);

		for(int i = 0; i < userList.size(); i++) {
			User temp = userList.get(i);
			System.out.println("이름: " + temp.getName() + ", 나이: " + temp.getAge());
		}

		System.out.println("------------------------------");
		for(int i = 0; i < userList.size(); i++) {
			User temp = userList.get(i);
			if(temp.getName().equals("홍길자")) {
				System.out.println("이름: " + temp.getName() + ", 나이: " + temp.getAge());
			}
		}
		
		for(User user : userList) {
			if(user.getName().equals("홍길자")) {
				System.out.println("이름: " + user.getName() + ", 나이: " + user.getAge());
			}
		}

		System.out.println("------------------------------");
		for(int i = 0; i < userList.size(); i++) {
			User temp = userList.get(i);
			if(temp.getName().equals("홍길동")) {
				userList.remove(temp);
			}
		}
		for(int i = 0; i < userList.size(); i++) {
			User temp = userList.get(i);
			System.out.println("이름: " + temp.getName() + ", 나이: " + temp.getAge());
		}
	}
}
