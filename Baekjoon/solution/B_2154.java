package solution;

import java.io.*;

//수 이어 쓰기 3 
/*
 * N이 주어졌을 때, N이 가장 먼저 등장하는 위치를 알아내는 프로그램을 작성
 */
public class B_2154 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		//배열로는 연속하는 순서를 찾기 어려움 -> StringBuilder 사용
		for (int i = 1; i <= N; i++) {
			sb.append(i); //숫자 저장
		}

		//N이 등장하는 위치
		int answer = sb.toString().indexOf(String.valueOf(N)) + 1;

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
