package solution;

import java.io.*;
import java.util.StringTokenizer;

//문자열
public class B_1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		String A = st.nextToken();
		String B = st.nextToken();

		int len = A.length();

		//B 문자열을 A 문자열만큼 반복
		for (int i = 0; i <= B.length() - A.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < A.length(); j++) {
				if(A.charAt(j) != B.charAt(i + j)) {
					cnt++;
				}
			}
			len = Math.min(len, cnt);
		}
		bw.write(len + "");
		bw.flush();
		bw.close();
	}
}
