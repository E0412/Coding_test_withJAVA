package solution;

import java.io.*;

//모음
/*
 * 모음의 개수를 세는 프로그램 작성
 * 모음 : 'a', 'e', 'i', 'o', 'u' 
 */
public class B_1264 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String input = br.readLine();
			int cnt = 0;

			if(input.equals("#")) {
				break;
			}

			char[] arr = {'a', 'e', 'i', 'o', 'u'}; //모음을 가진 배열 
			input = input.toLowerCase(); //입력받은 단어를 소문자로 변경

			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				for (int j = 0; j < arr.length; j++) {
					//입력받은 값이 모음이면
					if(ch == arr[j]) {
						cnt++; //개수++
					}
				}
			}
			bw.write(cnt + "");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
