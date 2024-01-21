package solution;

import java.io.*;
import java.util.StringTokenizer;

//초콜릿 자르기
public class B_2163 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int cnt = M * N - 1;

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
