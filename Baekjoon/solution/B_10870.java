package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//피보나치 수 
public class B_10870 {
	static int fibonacci(int N) { //N번째 피보나치 수 구하기 
		if(N == 0) return 0;
		if(N == 1) return 1;
		
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(N));
	}
}
