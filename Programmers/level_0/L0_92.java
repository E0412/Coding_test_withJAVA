package level_0;

//정수를 나선형으로 배치하기
public class L0_92 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};

		int x = 0; int y = 0; int dir = 0;

		for (int i = 1; i <= n * n; i++) {
			answer[x][y] = i;

			int nx = x + dx[dir];
			int ny = y + dy[dir];

			//방문했는지 확인, answer[nx][ny] != 0 검증은 제일 마지막에
			if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
				dir = (dir + 1) % 4; //방향 변경

				//변경된 방향으로 다음 위치 계산
				nx = x + dx[dir];
				ny = y + dy[dir];
			}
			//바뀐 값 할당
			x = nx;
			y = ny;
		}
		return answer;
	}
}
