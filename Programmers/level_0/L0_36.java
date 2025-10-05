package level_0;

import java.util.Scanner;

//qr code
public class L0_36 {
	static String solution(int q, int r, String code) {
		String answer = "";

		for (int i = 0; i < code.length(); i++) {
			if(i % q == r) {
				answer += code.charAt(i);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		int r = sc.nextInt();
		String s = sc.next();

		System.out.println(solution(q, r, s));
	}
}
