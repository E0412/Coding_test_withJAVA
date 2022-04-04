package String;

import java.util.Scanner;

public class s_0108 {
		public String solution(String s) {
			String answer = "NO";
			s = s.toUpperCase().replaceAll("[^A-Z]", "");
			String tmp = new StringBuilder(s).reverse().toString();
			if(s.equals(tmp)) answer = "YES";
			return answer;
		}
	
	public static void main(String[] args) {
		s_0108 T = new s_0108();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}	

}
