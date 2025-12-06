package level_0;

import java.util.Scanner;

//개미군단
public class L0_97 {
	public static int solution(int hp) {
		int five = hp / 5;
		hp = hp - five * 5;
		int three = hp / 3;
		hp = hp - three * 3;
		int one = hp / 1;

		int answer = five + three + one;
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hp = sc.nextInt();

		System.out.println(solution(hp));
	}
}
