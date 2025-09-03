package level_0;

import java.util.Scanner;

//홀짝 구분하기
public class L0_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n % 2 == 0) {
			System.out.print(n + " is even");
		} else {
			System.out.print(n + " is odd");
		}
	}
}
