package String;

import java.util.Scanner;

public class s_0106 {
	public String solution(String str) {
		String answer = "";
		for(int i = 0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i); //i�� ó������ �߰ߵǴ� �ε��� ��ȣ
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		 s_0106 T = new  s_0106();
		 Scanner kb = new Scanner(System.in);
		 String str = kb.next();
		 System.out.println(T.solution(str));
	}

}
