package level_0;

import java.util.Scanner;

//홀짝에 따라 다른 값 반환하기
public class L0_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = 0;

		while(n > 0) {
			//홀수인 경우
			if(n % 2 == 1) {
				answer += n;
				n -= 2;
			}
			//짝수인 경우 
			if(n %2 == 0) {
				answer += Math.pow(n, 2);
				n -= 2;
			}
		}
		System.out.println(answer);
	}
}
