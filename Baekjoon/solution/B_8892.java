package solution;

import java.io.*;

//팰린드롬
public class B_8892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		//팰린드롬 = 어느 방향으로 읽어도 항상 같은 방법으로 읽을 수 있는 단어
		//단어 k개 주어졌을 때, 팰린드롬을 찾는 프로그램을 작성

		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());

			for (int j = 0; j < k; j++) {
				String word = br.readLine();
			}
		}


		bw.flush();
		bw.close();
	}
}
