package level_0;

import java.util.Scanner;

//양꼬치
public class L0_93 {
	static int solution(int n, int k) {
		int s = n / 10;
		int answer = 12000 * n + (k - s) * 2000;
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(solution(n, k));
	}
}
