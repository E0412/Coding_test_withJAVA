package String;

import java.util.Scanner;

//숫자만 추출 0(48) ~ 9(57)
public class s_0109 {
	public int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) answer = answer * 10 + (x-48);
		}
		return answer;
	}
	public static void main(String[] args) {
		s_0109 T = new s_0109();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
