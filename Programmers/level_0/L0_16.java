package level_0;

import java.util.Scanner;

//주사위 게임 2
public class L0_16 {
	static int solution(int a, int b, int c) {
		int one = a + b + c;
		int two = a*a + b*b + c*c;
		int three = a*a*a + b*b*b + c*c*c;
		int answer = 0;

		if(a != b && b != c && a != c) {
			answer = one;
		} else if (a == b && b == c && a == c) {
			answer = one * two * three;
		} else if(a == b || c == a || b == c) {
			answer = one * two;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.print(solution(a, b, c));
	}
}
