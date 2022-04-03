package String;

import java.util.Scanner;

//회문문자열 대소문자 구분하지 않는다는 조건
public class s_0107 {
	public String solution(String str) {
		String answer = "Yes";
		int len = str.length();
		str = str.toUpperCase();
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		s_0107 T = new s_0107();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
