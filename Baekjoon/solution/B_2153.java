package solution;

import java.io.*;

//소수 단어
public class B_2153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int sum = 0;
		boolean check = false;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if(ch >= 'a' && ch <= 'z') {
				sum += (int) ch - 96;
			} else if(ch >= 'A' && ch <= 'Z') {
				sum += (int) ch - 38;
			}
		}
		//소수인지 확인
		for (int i = 2; i < sum; i++) {
			if(sum % i == 0) {
				check = true;
			}
		}
		//출력
		if(check) {
			bw.write("It is not a prime word.");
		} else {
			bw.write("It is a prime word.");
		}
		bw.flush();
		bw.close();
	}
}
