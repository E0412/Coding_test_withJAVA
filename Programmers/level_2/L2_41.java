package level_2;

//방문 길이
public class L2_41 {
	public int solution(String dirs) {
		int answer = 0;

		//UDRL
		int dx[] = {-1, 1, 0, 0};
		int dy[] = {0, 0, 1, -1};

		boolean visited[][][] = new boolean[11][11][4];
		int x = 0;
		int y = 0;

		//수정필요 : 이전 좌표도 검증 해야함
		for (int i = 0; i < dirs.length(); i++) {

			//0 = U 1 = D 2 = R 3 = L
			if(dirs.charAt(i) == 'U') {
				int nx = x + dx[0];
				int ny = y + dy[0];

				if(nx <= 5 && nx >= -5 && ny <= 5 && ny >= -5) {
					if(!visited[x + 5][y + 5][0]) {
						visited[x + 5][y + 5][0] = true;
						visited[nx + 5][ny + 5][0] = true;
						answer++;
						//현재 위치를 nx, ny로 변경
						x = nx;
						y = ny;
					}
				}
			}
			else if(dirs.charAt(i) == 'D') {
				int nx = x + dx[1];
				int ny = y + dy[1];

				if(nx <= 5 && nx >= -5 && ny <= 5 && ny >= -5) {
					if(!visited[x + 5][y + 5][1]) {
						visited[x + 5][y + 5][1] = true;
						visited[nx + 5][ny + 5][1] = true;
						answer++;

						x = nx;
						y = ny;
					}
				}
			}
			else if(dirs.charAt(i) == 'R') {
				int nx = x + dx[2];
				int ny = y + dy[2];

				if(nx <= 5 && nx >= -5 && ny <= 5 && ny >= -5) {
					if(!visited[x + 5][y + 5][2]) {
						visited[x + 5][y + 5][2] = true;
						visited[nx + 5][ny + 5][2] = true;
						answer++;

						x = nx;
						y = ny;
					}
				}
			}
			else if(dirs.charAt(i) == 'L') {
				int nx = x + dx[3];
				int ny = y + dy[3];

				if(nx <= 5 && nx >= -5 && ny <= 5 && ny >= -5) {
					if(!visited[x + 5][y + 5][3]) {
						visited[x + 5][y + 5][3] = true;
						visited[nx + 5][ny + 5][3] = true;
						answer++;

						x = nx;
						y = ny;
					}
				}
			}
		}
		return answer;
	}
}
