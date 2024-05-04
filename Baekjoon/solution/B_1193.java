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
					/* 분자 : 대각선 블럭의 개수 - (X번 - 직전 대각선까지 블럭 개수 - 1)
					 * 분모 : X번 - 직전 대각선까지 블럭 개수
					 */
					bw.write((cnt - (X - sum - 1)) + "/" + (X - sum));
					bw.flush();
					break;
				} 
				//대각선의 개수가 짝수인 경우 반대로 출력
				else {
					bw.write((X - sum) + "/" + (cnt - (X - sum - 1)));
					bw.flush();
					break;
				}
			} else {
				sum += cnt;
				cnt++;
			}
		}
		bw.close();
	}
}
