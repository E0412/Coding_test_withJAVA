package solution;

import java.io.*;

//수 뒤집기
public class B_3062 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		//좌우대칭인지 확인 
		for (int i = 0; i < T; i++) {
			String in = br.readLine();
			String reverse = "";
			//뒤집은 수 생성
			for (int j = in.length() - 1; j >= 0; j--) {
				reverse += in.charAt(j);
			}
		}

		bw.flush();
		bw.close();
	}
}
