package solution;

import java.io.*;

//애너그램 만들기
public class B_1919 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();

		char[] n = new char[26];
		char[] m = new char[26];

		for (int i = 0; i < a.length(); i++) {
			n[a.charAt(i) - 'a']++;
		}

		for (int i = 0; i < b.length(); i++) {
			m[a.charAt(i) - 'a']++;
		}

		int answer = 0;
		for (int i = 0; i < 26; i++) {
			answer += Math.abs(n[i] - m[i]);
		}
		System.out.println(answer);
	}
}
