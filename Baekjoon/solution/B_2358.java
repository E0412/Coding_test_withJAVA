package solution;

import java.io.*;
import java.util.*;

//평행선
public class B_2358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;

		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> xCnt = new HashMap<>();
		HashMap<Integer, Integer> yCnt = new HashMap<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			xCnt.put(x, xCnt.getOrDefault(x, 0) + 1);
			yCnt.put(y, yCnt.getOrDefault(y, 0) + 1);
		}
		//x축 또는 y축에 평행한 직선이 몇 개인지 작성
		int ans = 0;

		bw.flush();
		bw.close();
	}
}
