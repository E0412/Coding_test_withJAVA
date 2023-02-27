package solution;

import java.io.*;

//별 찍기 - 8
public class B_2445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		//5번째줄까지
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			for (int k = 1; k <= 2 * (N - i); k++) {
				bw.write(" ");
			}
			for (int l = 1; l <= i; l++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		//반대
		for (int i = N - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			for (int k = 1; k <= 2 * (N - i); k++) {
				bw.write(" ");
			}
			for (int l = 1; l <= i; l++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
