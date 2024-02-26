package solution;

import java.io.*;

//도비의 난독증 테스트
public class B_2204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			int N = Integer.parseInt(br.readLine());

			if(N == 0) break;

			String[] arr = new String[N];

			for (int i = 0; i < N; i++) {
				arr[i] = br.readLine();
			}
			//사전상 가장 앞서는 단어 찾기
		}

		bw.flush();
		bw.close();
	}
}
