package solution;

import java.io.*;

//등장하지 않는 문자의 합
/*
 * 문자열 S에 등장하지 않는 알파벳 대문자의 아스키 코드 값의 합을 한 줄에 하나씩 출력한다
 */
public class B_3059 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); //테스트 데이터

		for (int i = 0; i < N; i++) {
			String in = br.readLine();
			int sum = 0;
			boolean[] check = new boolean[26]; //알파벳 등장여부

			for (int j = 0; j < in.length(); j++) {
				int num = in.charAt(j) - 'A';
				check[num] = true; //등장하는 경우 true
			}
			for (int k = 0; k < 26; k++) {
				if(!check[k]) {
					sum += (k + 'A'); //등장하지 않는 값을 합한다
				}
			}
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}
}
