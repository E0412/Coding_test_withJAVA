package solution;

import java.util.Scanner;

//나머지 합 구하기 
public class B_10986 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt(); //수열의 개수
		int M = kb.nextInt(); //나누어 떨어져야 하는 수
		long[] S = new long[N]; //합 배열
		long[] C = new long[M]; //인덱스를 카운트하는 배열
		long answer = 0; 
		S[0] = kb.nextInt();
		
		//합 배열
		for( int i = 1; i<N; i++) {
			S[i] = S[i-1]+kb.nextInt();
		}
		
		//합 배열의 모든 값에 % 연산 수행
		for(int i = 0; i<N; i++) {
			int remainder = (int)(S[i]%M); //합배열을 M으로 나눈 나머지 값
			if(remainder == 0) answer++; //구간 합이 0일때 정답에++
				C[remainder]++; //나머지가 같은 인덱스 개수++
		}

		//나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 
		for(int i = 0; i<M; i++) {
			if(C[i]>1) {
				answer += (C[i]*(C[i]-1)/2);
			}
		}
		System.out.println(answer);
	}
}
