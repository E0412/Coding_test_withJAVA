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

		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<>();
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				list[i].add(s.substring(j) + s.substring(0, j));
			}
		}

		bw.flush();
		bw.close();
	}
}
