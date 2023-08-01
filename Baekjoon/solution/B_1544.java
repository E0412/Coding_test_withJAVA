package solution;

import java.io.*;
import java.util.ArrayList;

//사이클 단어
/*
 * 서로 다른 단어가 총 몇 개인지 구한다
 */
public class B_1544 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		ArrayList<String>[] list = new ArrayList[N];
		int cnt = 0; //서로 다른 단어의 개수 

		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<>();
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				list[i].add(s.substring(j) + s.substring(0, j));
			}
			boolean check = true;

			for (int n = 0; check && n <= i - 1; n++) {
				for (int m = 0; check && m < list[n].size(); m++) { //동일한 단어 확인
					if(s.equals(list[n].get(m))) {
						check = false;
					}
				}
			}
			if(check) {
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
