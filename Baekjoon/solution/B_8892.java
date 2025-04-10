package solution;

import java.io.*;

//팰린드롬
/* 팰린드롬 = 어느 방향으로 읽어도 항상 같은 방법으로 읽을 수 있는 단어
 * 단어 k개 주어졌을 때, 팰린드롬을 찾는 프로그램을 작성
 */
public class B_8892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			boolean chk = false;
			int k = Integer.parseInt(br.readLine());
			String word[] = new String[k];

			for (int j = 0; j < k; j++) {
				word[j] = br.readLine(); 
			}

			//이중 for문을 돌며 문자열을 붙인다
			for (int a = 0; a < k; a++) {
				for (int b = 0; b < k; b++) {
					if(a == b) continue;
					String tmp = word[a] + word[b];
					String reverse = new StringBuilder(tmp).reverse().toString();

					//뒤집은 문자와 비교 
					if(tmp.equals(reverse)) {
						sb.append(tmp).append("\n");
						chk = true;
						break;
					}
				}
			}
			//팰린드롬을 만들 수 없는 경우 
			if(chk == false) sb.append(0).append("\n");
		}
		bw.write(sb + "");
		bw.flush();
		bw.close();
	}
}
