package solution;

import java.io.*;
import java.util.StringTokenizer;

//사파리월드
public class B_2420 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());

		bw.write(Math.abs(N - M) + "");
		bw.flush();
		bw.close();
	}
}
