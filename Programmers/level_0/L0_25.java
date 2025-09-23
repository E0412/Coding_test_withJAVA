package level_0;

import java.util.Scanner;

//간단한 논리 연산
public class L0_25 {
	static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean answer = false;

		if((x1||x2) == true && (x3||x4) == true) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		boolean x1 = sc.nextBoolean();
		boolean x2 = sc.nextBoolean();
		boolean x3 = sc.nextBoolean();
		boolean x4 = sc.nextBoolean();

		System.out.println(solution(x1, x2, x3, x4));
	}
}
