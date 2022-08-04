package training;

import java.io.*;

//소수 찾기
public class D_0117 {
	
	static int N; //자릿수
	
	//DFS 구현 
	static void DFS(int num, int digit) {
		if(digit == N) {
			if(isPrime(num)) {
				System.out.println(num);
			}
			return;
		}
		for (int i = 1; i < 10; i++) {
			//짝수는 탐색 x
			if(i % 2 == 0) {
				continue;
			} 
			//소수는 재귀함수로 자릿수를 늘린다 
			if(isPrime(num * 10 + i)) {
				DFS(num * 10 + i, digit + 1);
			} //수 * 10 + 뒤에붙는 수(i), 자릿수 + 1 
		}
	}
	//소수 구하는 함수 
	static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) //2 <= 현재수 /2
			if(number % i == 0) return false; //나머지가 0이면 소수xx
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		//일의 자리 소수 DFS 탐색 
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
}
