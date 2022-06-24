package solution;

import java.util.Scanner;

//연속된 자연수의 합
public class B_2018 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int count = 1; //경우의 수
		int start = 1; //시작 인덱스
		int end = 1; //끝 인덱스 
		int sum = 1; //총합 
		while(end != N) {
			if(sum>N) {
				sum -= start;
				start++;
			} else if(sum < N) {
				end++; 
				sum += end;
			} else if(sum == N) {
				end++;
				sum += end;
				count++;
			}
		}
		System.out.println(count);
	}
}
