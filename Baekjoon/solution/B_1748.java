package solution;

import java.io.*;

//수 이어 쓰기 1
public class B_1748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int length = 0; //자릿수
		int num = 1; //자릿수에 더하는 수 
		int root = 10; //10의 제곱승
		
		//1부터 N까지의 수를 이어서 만들어진 수의 자릿수 구하기
		for (int i = 1; i <= N; i++) {
			
		}
		
		
		bw.flush();
		bw.close();
	}
}
