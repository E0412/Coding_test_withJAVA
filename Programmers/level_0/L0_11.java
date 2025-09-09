package level_0;

import java.util.Scanner;

//두 수의 연산값 비교하기
public class L0_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String s = String.valueOf(a) + String.valueOf(b);
		int tmp1 = Integer.parseInt(s);
		int tmp2 = 2 * a * b;
		
		int answer = Math.max(tmp1, tmp2);
		if(tmp1 == tmp2) {
			answer = tmp1;
		}
		System.out.println(answer);
	}
}
