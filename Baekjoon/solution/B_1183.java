package solution;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//약속
public class B_1183 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			//A - B 시간을 저장 
			arr[i] = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		//기다리는 시간의 합이 최소가 되는 서로 다른 정수 T의 개수구하기
		//N이 홀수인 경우
		if(N % 2 == 1) {
			bw.write(1 + "\n");
		}
		//N이 짝수인 경우 
		else {
			int answer = Math.abs(arr[N/2] - arr[N/2-1]) + 1;
			bw.write(answer + "\n");
		}
		bw.flush();
		bw.close();
	}
}
