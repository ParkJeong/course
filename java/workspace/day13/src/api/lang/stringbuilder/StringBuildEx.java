package api.lang.stringbuilder;

public class StringBuildEx {

	public static void main(String[] args) {

		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");

		System.out.println("str");
		System.out.println("sb");

		str = str + "choco";
		sb.append("choco");
		
		System.out.println(str);
		System.out.println(sb);
		
		// 끝에 문자열 추가
		sb.append("chip");
		System.out.println(sb);
		
		// 중간에 문자열 추가
		sb.insert(4, " ");
		System.out.println(sb);
		
		// 문자열 변경 replace
		sb.replace(0, 4, "자바");
		System.out.println(sb);
		
		// 문자열 삭제 delete
		sb.delete(2, sb.length());
		System.out.println(sb);
		
		// 문자열 거꾸로 reverse()
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.toString());
	}
}
