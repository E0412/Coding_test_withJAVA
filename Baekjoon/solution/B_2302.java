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

		int[] sit = new int[N]; //좌석에 앉는 서로 다른 방법의 가짓수


		bw.flush();
		bw.close();
	}
}
