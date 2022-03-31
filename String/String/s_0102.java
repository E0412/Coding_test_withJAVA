package String;

import java.util.Scanner;

public class s_0102 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) { //string을 문자열 배열로 변환
			/* if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x); //isLowerCase = character가 소문자일경우
			else answer+=Character.toLowerCase(x); //소문자->대문자 대문자->소문자 */
			//정수형으로 풀이 대문자는 65~90 소문자는 97~122 
			if(x>= 97 && x<=122) answer+=(char)(x-32);
			else answer+=(char)(x+32); //문자형으로 cast 필요 
		}
		return answer;
	}
	public static void main(String[] args) {
		s_0102 T = new s_0102();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
