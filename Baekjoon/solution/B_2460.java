package solution;

import java.io.*;
import java.util.StringTokenizer;

//지능형 기차 2
public class B_2460 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int now = 0; //현재 사람 수
		int result = 0; //최대 사람 수

		for (int i = 0; i < 10; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());
			int out = Integer.parseInt(st.nextToken());
			int in = Integer.parseInt(st.nextToken());

			now = now + in - out;

			if(result < now) {
				result = now;
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
