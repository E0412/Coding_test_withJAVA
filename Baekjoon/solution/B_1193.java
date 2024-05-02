package solution;

import java.io.*;

//분수찾기
public class B_1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine());

		int cnt = 0; //나열된 분수의 대각선 칸 개수
		int sum = 0; //칸의 누적 합

		while(true) {
			if(X <= cnt + sum) {
				//대각선 개수가 홀수인 경우
				if(cnt % 2 == 1) {
					//출력할 분수 구하기
					bw.write("");
					break;
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
