package solution;

import java.io.*;

//나이트 투어
/* 체스판의 한 칸은 A, B, C, D, E, F 중에서 하나와 
 * 1, 2, 3, 4, 5, 6 중에서 하나를 이어 붙인 것으로 나타낼 수 있다
 * 투어의 경로가 올바르면 Valid, 그렇지않으면 inValid 출력
 */
public class B_1331 {

	//체스판 좌표
	static int dx[] = {1, 2, 2, 1, -1, -2, -2, -1};
	static int dy[] = {2, 1, -1, -2, -2, -1, 1, 2};
	static int graph[][] = new int[6][6]; //체스판
	static boolean visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String start = br.readLine();

		int x = start.charAt(0) - 'A';
		int y = start.charAt(1) - '1';

		graph[x][y] = 1; //그래프 할당

		int cx = x; //현재 위치 저장
		int cy = y;

		for (int i = 1; i < 36; i++) {
			String end = br.readLine();

			int ex = end.charAt(0) - 'A';
			int ey = end.charAt(1) - '1';

			visit = false;

			for (int j = 0; j < 8; j++) {
				int nx = dx[j] + cx;
				int ny = dy[j] + cy;

				if(nx == ex && ny== ey && graph[nx][ny] == 0) {
					graph[nx][ny] = 1; //방문처리
					visit = true;
					break;
				}
			}
		}

		bw.flush();
		bw.close();
	}
}
