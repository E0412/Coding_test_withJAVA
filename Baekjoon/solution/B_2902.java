package solution;

import java.io.*;

//KMP는 왜 KMP일까?
/*
 * 긴 형태의 알고리즘 이름이 주어졌을 때, 이를 짧은 형태로 바꾸어 출력한다
 */
public class B_2902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			//대문자만 출력한다
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) { //'A' <= s.charAt(i) <= 'Z'
				char result = s.charAt(i);
				bw.write(result);
			}
		}
		bw.flush();
		bw.close();
	}
}
