package String;

import java.util.Scanner;

public class s_0105 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1; //index가 0이기때문에 -1을 해야한다
		while(lt<rt) {
			if(! Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s); //s라는 기본형 데이터를 String으로 변환
		return answer;
	}
	public static void main(String[] args) {
		s_0105 T = new s_0105();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
