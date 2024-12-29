package solution;

import java.io.*;
import java.util.Arrays;

//가로수
public class B_2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int answer = 0;
		//모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수 구하기
		// == 최대 공약수



		bw.flush();
		bw.close();
	}
}
