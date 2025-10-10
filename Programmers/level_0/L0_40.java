package level_0;

import java.util.Scanner;

//세로 읽기
public class L0_40 {
	public static String solution(String my_string, int m, int c) {
		String answer = "";

		for (int i = c - 1; i < my_string.length(); i += m) {
			answer += my_string.charAt(i);
		}

		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int m = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(solution(s, m, c));
	}
}
