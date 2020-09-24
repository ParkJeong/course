package quiz22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;
	private Scanner stdIn = new Scanner(System.in);

	public static class ScoreFormatException extends IllegalArgumentException{
		public ScoreFormatException(String message) {
			super(message);
		}
	}

	// 학생 정보를 입력받는 메서드
	public String inputStuInfo() {
		/*
		 * 학번, 이름, 국영수 를 입력받음
		 * 국영수는 문자열이 입력시에 다시 받을 수 있도록 예외처리
		 */
		System.out.print("학번>");
		stuId = stdIn.nextLine();

		System.out.print("이름>");
		name = stdIn.nextLine();

		while(true) {
			try {
				System.out.print("국영수>");
				kor = stdIn.nextInt();

				System.out.print("국영수>");
				eng = stdIn.nextInt();

				System.out.print("국영수>");
				math = stdIn.nextInt();

				if((kor >= 0 && kor <= 100) && (eng >= 0 && eng <= 100) && (math >= 0 && math <= 100)) {
					break;
				}else {
					throw new ScoreFormatException("성적은 0~100사이의 정수로 입력해주세요.");
				}


			} catch(InputMismatchException e) {
				System.out.println("국영수는 정수를 입력해주세요");
			} catch(ScoreFormatException e) {
				System.out.println(e);
			}

		}
		return stuId;
	}

	// 총점, 평균, 학점을 계산 메서드
	public void calcTotAvg() {
		// 합계 , 평균, 등급을 나누어서 멤버변수 저장
		total = kor + eng + math;
		avg = total / 3.0;
		grade = "A";
	}

	public void modify() {
		while(true) {
			try {
				System.out.print("국어>");
				kor = stdIn.nextInt();

				System.out.print("영어>");
				eng = stdIn.nextInt();

				System.out.print("수학>");
				math = stdIn.nextInt();

				if((kor >= 0 && kor <= 100) && (eng >= 0 && eng <= 100) && (math >= 0 && math <= 100)) {
					break;
				}else {
					throw new ScoreFormatException("성적은 0~100사이의 정수로 입력해주세요.");
				}


			} catch(InputMismatchException e) {
				System.out.println("국영수는 정수를 입력해주세요");
			} catch(ScoreFormatException e) {
				System.out.println(e);
			}

		}

	}

	// 학생정보 출력 메서드
	public void outputInfo() {
		System.out.printf("%4s%6s%11d점%11d점%11d점%11d점%11.2f점%10s\n",
				stuId, name, kor, eng, math, avg, total, grade);
	}







	public int getTotal() {
		return total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public static void main(String[] args) {

	}
}
