package level_2;

//방문 길이
public class L2_41 {
	int dx[] = {-1, 1, 0, 0};
	int dy[] = {0, 0, 1, -1};
	boolean[][][] visited = new boolean[11][11][4];

	int x = 0;
	int y = 0;
	int dir = 0;
	int[] rev = {1, 0, 3, 2}; //반대 위치 배열

	public int move(int dir) {
		int cnt = 0; //처음가는 길이면 1 아니면 0
		int nx = x + dx[dir];
		int ny = y + dy[dir];

		//범위는 -5 ~ 5 사이, 배열에는 음수가 들어갈 수 없어 +5를 하여 검증한다
		if(nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5) {
			if(!visited[x + 5][y + 5][dir]) {
				visited[x + 5][y + 5][dir] = true; 
				visited[nx + 5][ny + 5][rev[dir]] = true; 
				cnt++;
			}
			//방문 여부에 관계없이 x와 y값 변경
			x = nx;
			y = ny;
		}
		return cnt;
	}

	public int solution(String dirs) {
		int answer = 0;

		for (int i = 0; i < dirs.length(); i++) {
			if(dirs.charAt(i) == 'U') 
				dir = 0;
			else if(dirs.charAt(i) == 'D') 
				dir = 1;
			else if(dirs.charAt(i) == 'R') 
				dir = 2;
			else if(dirs.charAt(i) == 'L') 
				dir = 3;

			answer += move(dir);
		}
		return answer;
	}
}
