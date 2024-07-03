package solution;

import java.io.*;
import java.util.StringTokenizer;

//등수 구하기
public class B_1205 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		if(N == 0) {
			bw.write(1 + "");
			bw.flush();
			return;
		}

		int[] rank = new int[N];
		int r = 1;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			rank[i] = Integer.parseInt(st.nextToken());
		}

		//점수가 랭킹 리스트에 올라갈 수 없을 정도로 낮은 경우 -1을 출력
		if(N == P && cnt <= rank[rank.length - 1]) {
			bw.write(-1 + "");
			bw.flush();
		}
		//새로운 점수가 랭킹 리스트에서 몇 등을 하는지 출력
		else {
			for (int i = 0; i < rank.length; i++) {
				if(cnt < rank[i]) r++;
				else break;
			}
			bw.write(r + "");
			bw.flush();
		}
		bw.close();
	}
}
