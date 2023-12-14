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
		String[] arr = new String[N + 1];
		int now = 0; //위치

		for (int i = 1; i <= N; i++) {
			arr[i] = String.valueOf(i); //숫자 저장
		}

		//N이 등장하는 위치를 찾아야함
		//배열 말고 다른거 찾아보기

		bw.flush();
		bw.close();
	}
}
