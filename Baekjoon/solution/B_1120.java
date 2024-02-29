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

		for (int i = 0; i < B.length() - A.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < len; j++) {
				//A와 B의 길이가 같으면서, A와 B의 차이를 최소가 되도록 했을 때, 차이를 출력
			}
		}

		bw.flush();
		bw.close();
	}
}
