package solution;

import java.io.*;

//16진수
public class B_1550 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		// Integer.parseInt(type, n진수) 이용
		int answer = Integer.parseInt(s, 16);

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
