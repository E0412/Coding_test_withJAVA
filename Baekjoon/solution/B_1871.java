package solution;

import java.io.*;
import java.util.StringTokenizer;

//좋은 자동차 번호판
public class B_1871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String in = br.readLine();
			StringTokenizer st  = new StringTokenizer(in, "-");	

			String fst = st.nextToken(); //첫번째 번호판
			String snd = st.nextToken(); //두번째 번호판
			int cnt = 0;
			int sum = 0;
			//좋은 번호판이면 "nice"를, 아니면 "not nice"를 출력
		}

		bw.flush();
		bw.close();
	}
}
