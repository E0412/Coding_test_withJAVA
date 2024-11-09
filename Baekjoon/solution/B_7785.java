package solution;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

//회사에 있는 사람
public class B_7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Stack<String> s = new Stack<String>();

		StringTokenizer	st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			String in = st.nextToken();
			s.add(in);

			//leave인 경우 제외
		}

		bw.flush();
		bw.close();
	}
}
