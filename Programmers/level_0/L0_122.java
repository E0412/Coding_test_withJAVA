package level_0;

import java.util.Scanner;

//직각삼각형 출력하기
public class L0_122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			sb.append("*");
			System.out.println(sb.toString());
		}
	}
}
