package solution;

import java.io.*;
import java.util.StringTokenizer;

//가장 많은 글자
public class B_1371 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int[] arr = new int[26]; //알파벳 배열
		String s = br.readLine();

		while(s != null) {
			for (int i = 0; i < arr.length; i++) {
				if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					arr[s.charAt(i) - 'a']++;
				}
			}
		}
		int max = 0;
		//가장 많이 나온 문자를 출력

		bw.flush();
		bw.close();
	}
}
