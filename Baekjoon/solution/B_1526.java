package solution;

import java.io.*;

//가장 큰 금민수
/*
 * 금민수 = 4와 7로만 이루어진 수
 * N이 주어졌을 때, N보다 작거나 같은 금민수 중 가장 큰 것을 출력
 */
public class B_1526 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		//가장 큰 수를 출력 > 백트래킹
		for (int i = N; i >= 4; i--) {
			boolean check = true;
			int tmp = i;

			while(tmp != 0) {
				//끝자리 수가 4 혹은 7인 경우 10으로 나눈다
				if(tmp % 10 == 4 || tmp % 10 == 7) {
					tmp /= 10;
				} else {
					check = false;
					break;
				}
			}
			if(check) {
				bw.write(i + "");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
