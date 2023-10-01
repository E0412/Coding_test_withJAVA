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
			/*
			 -는 0에 대응한다.
			\는 1에 대응한다.
			(는 2에 대응한다.
			@는 3에 대응한다.
			?는 4에 대응한다.
			>는 5에 대응한다.
			&는 6에 대응한다.
			%는 7에 대응한다.
			/는 -1에 대응한다.
			 */
		}
	}
}
