package level_0;

import java.util.Scanner;

//더 크게 합치기
public class L0_10 {

	static int solution(int a, int b) {
		String s = String.valueOf(a) + String.valueOf(b);
		String s2 = String.valueOf(b) + String.valueOf(a);

		int answer = Math.max(Integer.parseInt(s), Integer.parseInt(s2));
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int answer = solution(a, b);
		System.out.println(answer);
	}
}
