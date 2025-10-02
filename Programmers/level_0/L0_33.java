package level_0;

import java.util.Scanner;

//문자열 뒤집기
public class L0_33 {
	static String solution(String my_string, int s, int e) {
		StringBuilder answer = new StringBuilder(my_string);
		StringBuilder change = new StringBuilder(my_string.substring(s, e+1)).reverse();

		answer.replace(s, e+1, change.toString());

		return answer.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(solution(s, n, m));
	}
}
