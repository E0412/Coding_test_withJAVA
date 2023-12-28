package solution;

import java.io.*;
import java.util.StringTokenizer;

//받아올림
public class B_4388 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			if(n + m == 0) break;
			int cnt = 0; //받아올림 개수
			int tmp = 0;

			while(n != 0 || m != 0) {
				int ncnt = n % 10;
				int mcnt = m % 10;
				n /= 10;
				m /= 10;
				if(ncnt + mcnt + tmp >= 10) {
					cnt++;
					tmp = 1;
				} else tmp = 0;
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
		bw.close();
	}
}
