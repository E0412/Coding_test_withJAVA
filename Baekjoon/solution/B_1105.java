package solution;

import java.io.*;
import java.util.StringTokenizer;

//팔
public class B_1105 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		String L = st.nextToken();
		String R = st.nextToken();

		int cnt = 0;
		int tmp;

		//자리수가 다른 경우
		if(L.length() != R.length()) {
			bw.write(cnt + "");
		}
		//자리수가 같은 경우 
		else {
			tmp = 0;
			//수를 비교한다
			while(tmp < L.length() && L.charAt(tmp) == R.charAt(tmp)) {
				//8이 있는 경우 개수에 더한다
				if(L.charAt(tmp) == '8') {
					cnt++;
				}
				tmp++;
			}
			bw.write(cnt + "");
		}
		bw.flush();
		bw.close();
	}
}
