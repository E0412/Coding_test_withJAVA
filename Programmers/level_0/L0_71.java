package level_0;

import java.util.Scanner;

//문자열 바꿔서 찾기
public class L0_71 {
	static int solution(String myString, String pat) {
		int answer = 0;
		myString = myString.replace("A", "C");
		myString = myString.replace("B", "A");
		myString = myString.replace("C", "B");

		if(myString.contains(pat)) {
			answer = 1;
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ms = sc.next();
		String p = sc.next();
		
		System.out.println(solution(ms, p));
	}
}
