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
			int num = 0;

			for (int i = 1; i <= N; i++) {
				num = (num * 10 + 1) % N;
				
				if(num == 0) {
					bw.write(i + "");
					bw.flush();
					break;
				}
			}
		}
		br.close();
		bw.close();
	}
}
