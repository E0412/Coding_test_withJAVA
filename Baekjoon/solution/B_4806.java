package solution;

import java.io.*;

//줄 세기
public class B_4806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String in;
		int cnt = 0;

		while((in = br.readLine()) != null) {
			cnt++;
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
