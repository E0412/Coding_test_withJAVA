package solution;

import java.io.*;

//극장 좌석
public class B_2302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		int[] vip = new int[M];
		for (int i = 0; i < M; i++) {
			vip[i] = Integer.parseInt(br.readLine()); 
		}

		int[] sit = new int[41]; //좌석에 앉는 서로 다른 방법의 가짓수
		sit[0] = 1;
		sit[1] = 1;
		sit[2] = 2;

		for (int i = 3; i <= N; i++) {
			sit[i] = sit[i - 1] + sit[i - 2];
		}

		int answer = 1;

		int before = 0; //이전 위치
		for (int num : vip) {
			answer *= sit[num - before - 1];
			before = num;
		}
		answer *= sit[N - before];

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
