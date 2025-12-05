package level_0;

import java.util.Scanner;

//아이스 아메리카노
public class L0_96 {
	public static int[] solution(int money) {
		int[] answer = new int[2];
		answer[0] = money / 5500;
		answer[1] = money - 5500 * (money/5500);
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();

		System.out.println(solution(m));
	}
}
