package solution;

import java.io.*;
import java.util.StringTokenizer;

//검증수
public class B_2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int N = Integer.parseInt(st.nextToken());
			sum += N * N;
		}
		bw.write(sum % 10 + "");
		bw.flush();
		bw.close();
	}
}
