package solution;

import java.io.*;
import java.util.StringTokenizer;

//삼각형으로 자르기 
public class B_1198 {

	//삼각형의 넓이 
	static double range(int[] x, int[] y, int[] z) {
		return (double) Math.abs(x[0] * y[1] + y[0] * z[1] + z[0] * x[1]
				- x[1] * y[0] - y[1] * z[0] - z[1] * x[0]) / 2;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[][] p = new int[N][2]; //꼭짓점
		double ans = 0; //넓이의 최댓값

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					ans = Math.max(ans, range(p[i], p[j], p[k]));
				}
			}
		}
		bw.write(Double.toString(ans));
		bw.flush();
		bw.close();
	}
}
