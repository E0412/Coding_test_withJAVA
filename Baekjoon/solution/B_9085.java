package solution;

import java.io.*;
import java.util.StringTokenizer;

//더하기
/*
 * 10보다 작거나 같은 자연수 N개를 더한다 
 */
public class B_9085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine()); //테스트 케이스 개수 

		for (int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int ans = 0;

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int M = Integer.parseInt(st.nextToken());
				ans += M;
			}
			bw.write(ans + "");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
