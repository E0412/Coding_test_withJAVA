package solution;

import java.io.*;

//도미노
public class B_2921 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int answer = 0;
		for (int i = 0; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				answer += (i + j);
			}
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
