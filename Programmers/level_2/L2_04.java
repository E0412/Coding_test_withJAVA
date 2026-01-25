package level_2;

import java.util.*;

//게임 맵 최단거리
public class L2_04 {
	public int solution(int[][] maps) {
		int a = maps.length;
		int b = maps[0].length;

		//상하좌우 생성
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		//배열을 담을 큐 생성 후 기본값 0,0 저장
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[]{0, 0});

		while(!q.isEmpty()) {
			//큐에 담은 최근 위치 저장
			int[] now = q.poll(); //{0, 0}과 같은 큐의 값
			int x = now[0];
			int y = now[1];

			//최근 위치에서 상하좌우로 이동
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				//{0, -1} 같은 경우 배제되도록 조건 생성
				if(nx < 0 || ny < 0 || nx >= a || ny >= b) continue;
				//현재 위치 확인 후 값에 1을 추가하여 이동거리를 기록하고 큐에 추가
				if(maps[nx][ny] == 1) {
					maps[nx][ny] = maps[x][y] + 1;
					q.add(new int[]{nx, ny});
				}
			}
		}
		//도달하지 못하면 -1, 도달하면 값 반환
		return maps[a-1][b-1] == 1 ? -1 : maps[a-1][b-1];
	}
}
