package solution;

import java.io.*;

//수 복원하기
/*
 * 양의 정수 N이 주어졌을 때, 이 수를 소인수분해 한 결과를 출력
 */
public class B_2312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TC = Integer.parseInt(br.readLine());

		for (int i = 0; i < TC; i++) {
			int tmp = Integer.parseInt(br.readLine());

			//소인수분해 
			for (int j = 2; j <= tmp; j++) {
				int result = 0;

				while(tmp % j == 0) {
					tmp /= j;
					result++;
				}
				if(result != 0) {
					bw.write(j + " " + result + "\n");
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
