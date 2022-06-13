package solution;

import java.util.Scanner;

//숫자의 합
public class B_11720 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //정수 입력 
		String s = kb.next(); //문자열 입력도 받아야 한다 
		int sum = 0;
		
		for(int i = 0; i<n; i++) {
			sum += s.charAt(i) - '0'; //타입을 char로 바꾸고 연산한다
		}
		System.out.println(sum);
	}
}

