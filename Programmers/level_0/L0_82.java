package level_0;

import java.util.Scanner;

//문자열 정수의 합
public class L0_82 {
	static int solution(String num_str) {
		int answer = 0;
		for (int i = 0; i < num_str.length(); i++) {
			answer += Integer.parseInt(num_str.substring(i, i+1));
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(solution(s));
	}
}
