package solution;

import java.io.*;
import java.util.StringTokenizer;

//예산
public class B_2512 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); //지방의 수 
		int arr[] = new int[N];
		int left = 0;
		int right = -1;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
			right = Math.max(right, arr[i]);
		}

		int M = Integer.parseInt(br.readLine()); //전체 예산

		//배정된 예산들 중 최댓값인 정수를 출력
		while(left <= right) {
			int mid = (left + right) / 2;
			long num = 0;
			for (int i = 0; i < N; i++) {
				if(arr[i] > mid) {
					num += mid;
				} else {
					num += arr[i];
				}
			}
			if(num <= M) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		bw.write(right + "");
		bw.flush();
		bw.close();
	}
}
