package solution;

import java.io.*;

//사탕 선생 고창영
public class B_2547 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			br.readLine();
			int N = Integer.parseInt(br.readLine()); //학생 수
			long sum = 0;

			for (int j = 0; j < N; j++) {
				int candy = Integer.parseInt(br.readLine()); //학생 수
				sum = (sum + candy) % N;
			}
			if(sum % N == 0) {
				bw.write("YES" + "\n");
			} else {
				bw.write("NO" + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
