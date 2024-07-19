package solution;

import java.io.*;
import java.util.StringTokenizer;

//이상한 곱셈
public class B_1225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		String N = st.nextToken();
		String M = st.nextToken();
		long result = 0; 

		for (int i = 0; i < N.length(); i++) {
			for (int j = 0; j < M.length(); j++) {
				result += ((N.charAt(i) - '0') * (M.charAt(j) - '0'));
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
