package solution;

import java.io.*;

//숫자놀이
/* 주어진 숫자의 각 자릿수를 더한다.
 * 결과가 한 자릿수가 될 때 까지 규칙1을 반복한다.
 */
public class B_2145 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N, a, b;

		while(true) {
			N = Integer.parseInt(br.readLine());

			if(N == 0) {
				break;
			}
			while(N >= 10) {
				a = N; 
				b = 0;
				//자릿수를 쪼갠 후 더한다
				while(a > 0) {
					b += a % 10; 
					a /= 10;
				}
				N = b;
			}
			bw.write(N + "\n");
		}
		bw.flush();
		bw.close();
	}
}
