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

		while(true) {
			String input = br.readLine();

			if(input.equals("0")) break;

			int cnt = 2; // 처음 앞 뒤 여백
			cnt += input.length() - 1; //숫자 사이에 여백 + 1 추가 

			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);

				if(ch == '1') {
					cnt += 2;
				}
				else if(ch == '0') {
					cnt += 4;
				}
				else {
					cnt += 3;
				}
			}
			bw.write(cnt + "\n");
		}

		bw.flush();
		bw.close();
	}
}
