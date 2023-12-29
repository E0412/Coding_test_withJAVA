package solution;

import java.io.*;
import java.util.StringTokenizer;

//중간계 전쟁
public class B_4435 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[][] point = {{1, 2, 3, 3, 4, 10}, {1, 2, 2, 2, 3, 5, 10}};

		for (int i = 1; i <= T; i++) {
			int[] group = new int[2];
			for (int j = 0; j < 2; j++) {
				st  = new StringTokenizer(br.readLine());
				int n = 0;
				while(st.hasMoreTokens()) {
					group[j] += Integer.parseInt(st.nextToken()) * point[j][n];
					n++;
				}
			}
		}
	}
}
