package solution;

import java.io.*;

//칸토어 집합
public class B_4779 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String s = "";

		while((s = br.readLine()) != null) {
			int N = Integer.parseInt(s);
			int m = (int) Math.pow(3, N);
			//'-'가 3^N개 있는 문자열
			for (int i = 0; i < m; i++) {
				sb.append("-");
			}
			//칸토어 집합의 근사구하기
		}
		bw.flush();
		bw.close();
	}
}
