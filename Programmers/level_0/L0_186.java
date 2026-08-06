package level_0;

//안전지대
public class L0_186 {
	public int solution(int[][] board) {
		int answer = 0;
		//대각선 좌표
		int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

		int n  = board.length;
		int arr[][] = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//지뢰 위치 확인
				if(board[i][j] == 1) {
					arr[i][j] = 1;

					//주변 상하좌우 대각선을 1로 만든다
					for (int k = 0; k < 8; k++) {

						int nx = i + dx[k];
						int ny = j + dy[k];

						if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
							arr[nx][ny] = 1;
						}
					}
				}
			}
		}
		//안전지대 개수 세기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] == 0) {
					answer++;
				}
			}
		}
		return answer;
	}
}
