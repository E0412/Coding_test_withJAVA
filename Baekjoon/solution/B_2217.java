package solution;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

//로프
public class B_2217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];

		//로프의 최대 중량 입력
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		//내림차순으로 정렬
		Arrays.sort(arr, Collections.reverseOrder());

		//들어올릴 수 있는 최대 중량 구하기
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, arr[i] * (i + 1));
		}
		bw.write(max + "");
		bw.flush();
		bw.close();
	}
}
