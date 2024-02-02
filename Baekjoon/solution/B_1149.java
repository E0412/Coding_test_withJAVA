package solution;

import java.io.*;
import java.util.StringTokenizer;

//RGB 거리
/* 1번 집의 색은 2번 집의 색과 같지 않아야 한다.
 * N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
 * i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
 */
public class B_1149 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][3];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if(st.hasMoreTokens()) {
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
				arr[i][2] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i < N; i++) {
			//i번째 집이 r, g, b일 때 
			int r = arr[i][0];
			int g = arr[i][1];
			int b = arr[i][2];

			//최솟값 저장
			arr[i][0] = r + Math.min(arr[i-1][1], arr[i-1][2]);
			arr[i][1] = g + Math.min(arr[i-1][0], arr[i-1][2]);
			arr[i][2] = b + Math.min(arr[i-1][1], arr[i-1][0]);
		}
		int cost = Math.min(Math.min(arr[N - 1][0], arr[N-1][1]), arr[N-1][2]);
		bw.write(cost + "");
		bw.flush();	
		bw.close();
	}
}
