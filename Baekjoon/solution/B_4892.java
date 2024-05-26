package solution;

import java.io.*;

//숫자 맞추기 게임
public class B_4892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = 1; //케이스 번호

		while(true) {
			int N = Integer.parseInt(br.readLine());

			if(N == 0) break; //종료조건

			//n1이 짝수라면 'even'출력 후 n4 출력
			if(N % 2 == 0) {
				N = ((N * 3) / 2) * 3 / 9;
				bw.write(num + ". even " + N + "\n");
			}
			//n1이 홀수라면 'odd'와 n4를 출력
			else {
				N = (((N * 3) + 1) / 2) * 3 / 9;
				bw.write(num + ". odd " + N + "\n");
			}
			num++;
		}
		bw.flush();
		bw.close();
	}
}
