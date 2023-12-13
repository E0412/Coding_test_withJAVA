package solution;

import java.io.*;

//1
/* 
 * 각 자릿수가 모두 1로만 이루어진 n의 배수 중 가장 작은 수의 자리수를 출력
 */
public class B_4375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String in;
		while((in = br.readLine()) != null) {
			int N = Integer.parseInt(in);
			int cnt = 1;
			int answer = 1;

			//분배법칙 활용
			while((cnt = cnt % N) != 0) {
				answer++;
				cnt = cnt * 10 + 1;
			}
			bw.write(answer + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
