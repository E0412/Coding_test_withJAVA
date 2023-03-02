package solution;

import java.io.*;
import java.util.StringTokenizer;

//10부제
public class B_10797 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); //날짜의 일의 자리 숫자

		int cnt = 0;

		StringTokenizer st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; i++) {
			int day = Integer.parseInt(st.nextToken());

			if(N == day) {
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
