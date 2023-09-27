package solution;

import java.io.*;
import java.util.StringTokenizer;

//짐 챙기는 숌
public class B_1817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken()); //책의 개수
		int M = Integer.parseInt(st.nextToken()); //최대 무게

		//책의 개수가 0인경우
		if(N == 0) {
			bw.write(0 + "");
			bw.flush();
			return;
		}

		int cnt = 1;
		int max = M;
		st  = new StringTokenizer(br.readLine());	
		while(N-- > 0) { //책의 개수가 0이상인 경우
			int tmp = Integer.parseInt(st.nextToken());

			if(M - tmp >= 0) {
				M -= tmp;
			} else {
				cnt++;
				M = max - tmp;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
