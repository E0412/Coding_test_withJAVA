package solution;

import java.io.*;

//줄임말 만들기
public class B_3181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String arr[] = br.readLine().split(" ");
		String ans = "";

		for (int i = 0; i < arr.length; i++) {
			//쓸모없는 단어가 있는지 검사
			if(arr[i].equals("i") || arr[i].equals("pa") || arr[i].equals("te") || arr[i].equals("ni") || 
					arr[i].equals("niti") || arr[i].equals("a") || arr[i].equals("ali") || 
					arr[i].equals("nego") || arr[i].equals("no") || arr[i].equals("ili")) {
				if(i == 0) {
					String[] s = arr[0].split("");
					ans += s[0].toUpperCase();
				}
			} else {
				String[] s = arr[i].split("");
				ans += s[0].toUpperCase();
			}
		}
		bw.write(ans);
		bw.flush();
		bw.close();
	}
}
