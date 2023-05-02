package solution;

import java.io.*;

//단축키 지정
public class B_1283 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < 30; i++) {
			String s = br.readLine(); 
			char ch = s.charAt(i);
		}

		bw.flush();
		bw.close();
	}
}
