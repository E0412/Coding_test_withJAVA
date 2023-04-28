package solution;

import java.io.*;

//집 주소
/*
 * 각 숫자 사이에는 1cm의 여백이 존재 -> 숫자당 + 1
 * 1은 2cm의 너비를 차지, 0은 4cm의 너비를 차지한다. 나머지 숫자는 모두 3cm의 너비를 차지한다.
 * 호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.
 * 각 입력마다 얼마만큼 너비를 차지하는지 정수로 출력
 */
public class B_1284 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = 0;

		for (int i = 1; i < 10000; i++) {
			String input = br.readLine();
			char ch = input.charAt(i);

			if(ch == 1) {
				cnt += 2;
			}
			if(ch == 2) {
				cnt += 3;
			}
			if(ch == 0) {
				cnt += 4;
			}
			if(input == "0") break;
		}
		//각 입력마다 처리하는 것 추가하기

		bw.flush();
		bw.close();
	}
}
