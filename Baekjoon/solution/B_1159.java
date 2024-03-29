package solution;

import java.io.*;

//농구 경기
public class B_1159 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[26];

		for (int i = 0; i < N; i++) {
			String in = br.readLine(); 
			arr[in.charAt(0) - 'a']++; 
		}

		//성의 첫 글자가 같은 선수 5명을 선발
		boolean draft = false; //선발이 된 경우 true
		for (int i = 0; i < 26; i++) {
			if(arr[i] >= 5) {
				bw.write((char)(i + 'a'));
				draft = true;
			} 
		}
		if(!draft) {
			bw.write("PREDAJA");
		}
		bw.flush();
		bw.close();
	}
}
