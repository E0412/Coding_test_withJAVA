package solution;

import java.io.*;

//이진수 합
public class B_8741 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int K = Integer.parseInt(br.readLine());
		int sum = 0;

		// K인 경우 1이 K개 0이 K - 1개임에 따라 1과 0을 저장
		for (int i = 0; i < K; i++) {
			sb.append("1");	
		}

		for (int i = 0; i < K - 1; i++) {
			sb.append("0");	
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
