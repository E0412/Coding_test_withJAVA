package level_0;

import java.util.Scanner;

//문자열 겹쳐쓰기
public class L0_07 {

	static String solution(String my_string, String overwrite_string, int s) {

		String tmp1 = my_string.substring(0, s);
		String tmp2 = my_string.substring(s + overwrite_string.length());

		String answer = tmp1 + overwrite_string + tmp2;
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ms = sc.nextLine();
		String os = sc.nextLine();
		int n = sc.nextInt();

		System.out.println(solution(ms, os, n));
	}
}
