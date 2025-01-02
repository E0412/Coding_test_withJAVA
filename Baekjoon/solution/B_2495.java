package solution;

import java.io.*;

//연속구간
public class B_2495 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//같은 숫자가 연속하여 나오는 가장 긴 길이를 입력 순서대로 출력
		for (int i = 0; i < 3; i++) {
			String in = br.readLine();
			char c = in.charAt(0);
			int answer = 0;
			int cnt = 0;

			for (int j = 1; j < in.length(); j++) {
				char ch = in.charAt(j);
				
				if(c == ch) {
					cnt++;
				} 
			}
		}
		
		bw.flush();
		bw.close();
	}
}
