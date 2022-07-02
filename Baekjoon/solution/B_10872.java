package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팩토리얼
public class B_10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 1;
		
		//N이 0이 아닐때까지 1씩 감소
		while(N != 0) {
			sum *= N;
			N--;
		}
		System.out.println(sum);
	}
}
