package solution;

import java.io.*;

//문자열 교환
/*
 * a와 b로만 이루어진 문자열이 주어질 때,  
 * a를 모두 연속으로 만들기 위해서 필요한 교환의 횟수를 최소로 하는 프로그램을 작성한다
 */
public class B_1522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String in = br.readLine();

		int a_num = 0; //a의 갯수

		for (int i = 0; i < in.length(); i++) {
			if(in.charAt(i) == 'a') {
				a_num++;
			}
		}

		int cnt = 0; //교환 횟수
		int answer = in.length();

		for (int i = 0; i < in.length(); i++) {
			cnt = 0; //초기화

			for (int j = i; j < a_num + i; j++) {
				if(in.charAt(j % in.length()) == 'b') {
					cnt++;
				}
			}
			answer = Math.min(answer, cnt);
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
