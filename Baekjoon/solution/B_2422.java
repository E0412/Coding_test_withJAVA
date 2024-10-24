package solution;

import java.io.*;
import java.util.StringTokenizer;

//한윤정이 이탈리아에 가서 아이스크림을 사먹는데 
public class B_2422 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); //아이스크림 종류의 수
		int M = Integer.parseInt(st.nextToken()); //섞어먹으면 안 되는 조합의 개수
		int[][] select = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			select[n][m] = select[m][n] = 1; //조합
		}

		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) {
				if(select[i][j] == 1) continue;
				for (int k = j + 1; k <= N; k++) {
					if(select[j][k] == 0 && select[k][i] == 0) {
						cnt++;
					}
				}
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
