package solution;

import java.io.*;
import java.util.StringTokenizer;

//소수 찾기
public class B_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		StringTokenizer st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int in = Integer.parseInt(st.nextToken());
			for (int j = 2; j <= in; j++) {
				if(j == in) cnt++;
				if(in % j == 0) break;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
