package solution;

import java.io.*;
import java.util.ArrayList;

//문어 숫자
public class B_1864 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String input = br.readLine();
			ArrayList<Character> list = new ArrayList<Character>();

			//낮은 자리의 문자열부터 처리
			for (int i = input.length() - 1; i >= 0; i--) {
				if(input.charAt(i) == '#') {
					return;
				}
				list.add(input.charAt(i));
			}

			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				switch (list.get(i)) {
				case '-':
					sum += 0;
					break;
				case '(':
					sum += 2 * Math.pow(8, i); //8의 i제곱
					break;
				case '@':
					sum += 3 * Math.pow(8, i); //8의 i제곱
					break;
				case '?':
					sum += 4 * Math.pow(8, i); //8의 i제곱
					break;
				case '>':
					sum += 5 * Math.pow(8, i); //8의 i제곱
					break;
				case '&':
					sum += 6 * Math.pow(8, i); //8의 i제곱
					break;
				case '%':
					sum += 7 * Math.pow(8, i); //8의 i제곱
					break;
				case '/':
					sum += -1 * Math.pow(8, i); //8의 i제곱
					break;
				// '\'가 불가능하여 디폴트값으로 설정
				default:
					sum += 1 * Math.pow(8, i);
					break;
				}
			}
			bw.write(sum + "\n");
			bw.flush();
		}
	}
}
