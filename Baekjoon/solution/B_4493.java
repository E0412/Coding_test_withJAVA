package solution;

import java.io.*;
import java.util.StringTokenizer;

//가위 바위 보?
public class B_4493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			int cnt = 0;

			for (int j = 0; j < M; j++) {
				StringTokenizer st  = new StringTokenizer(br.readLine());
				String p1 = st.nextToken();
				String p2 = st.nextToken();

				//p1이 이기는 경우 cnt++
				if(p1.equals("P") && p2.equals("R") || p1.equals("R") && p2.equals("S")
						|| p1.equals("S") && p2.equals("P")) {
					cnt++;
				} 
				//p2가 이기는 경우 cnt--
				else if(p1.equals("R") && p2.equals("P") || p1.equals("S") && p2.equals("R")
						|| p1.equals("P") && p2.equals("S")) {
					cnt--;
				}
			}
			//cnt가 양수이면 p1이 승자, 음수이면 p2가 승자 
			if(cnt > 0) {
				bw.write("Player 1\n");
			} else if(cnt < 0) {
				bw.write("Player 2\n");
			} else {
				bw.write("TIE\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
