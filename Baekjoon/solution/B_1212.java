package solution;

import java.io.*;

//8진수 2진수
public class B_1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String in = br.readLine();

		for (int i = 0; i < in.length(); i++) {
			//숫자를 2진수 문자열로 변환
			String s = Integer.toBinaryString(in.charAt(i) - '0');

			if(s.length() == 2 && i != 0) {
				s = "0" + s;
			} else if(s.length() == 1 && i != 0) {
				s = "00" + s;
			}
			sb.append(s);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
