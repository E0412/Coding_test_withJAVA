package solution;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//표절
public class B_2428 {

	static int[] arr;

	//이분탐색
	static int binarySearch(int in) {
		int start = in + 1;
		int end = arr.length - 1;
		int tmp = start;

		//검사하지 않는 경우 
		if(arr[in] * 10 < 9 * arr[in + 1]) return in;

		while(start < end) {
			int mid = (start + end) / 2;
			// i≠j이고, size(Fi) ≤ size(Fj)이면서, size(Fi) ≥ 0.9 × size(Fj)인 쌍 검사	
		}

		return tmp;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;

		int N = Integer.parseInt(br.readLine());
		arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr); //이분 탐색을 위한 정렬

		long answer = 0; //비교 횟수

		for (int i = 0; i < arr.length - 1; i++) {

		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
