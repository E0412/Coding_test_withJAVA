package solution;

import java.io.*;

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

		for (int i = 2; i <= N; i++) {
			String in = br.readLine();
			arr[i][0] = (Integer.parseInt(in.split(" ")[0]));
			arr[i][1] = (Integer.parseInt(in.split(" ")[1]));
			arr[i][2] = (Integer.parseInt(in.split(" ")[2]));
		}

		bw.flush();	
		bw.close();
	}
}
