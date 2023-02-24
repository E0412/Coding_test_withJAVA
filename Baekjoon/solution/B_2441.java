package solution;

import java.util.Scanner;

//별 찍기 - 4
public class B_2441 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = N - i; j < N; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
