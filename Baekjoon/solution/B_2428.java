package solution;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//표절
public class B_2428 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr); //이분 탐색을 위한 정렬

		long answer = 0; //비교 횟수
		//이분탐색
		for (int i = 0; i < arr.length; i++) {

		}

		bw.flush();
		bw.close();
	}
}
