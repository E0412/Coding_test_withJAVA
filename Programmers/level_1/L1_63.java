package level_1;

//[PCCE 기출문제] 9번 / 이웃한 칸
public class L1_63 {
	public int solution(String[][] board, int h, int w) {
		int answer = 0; //같은 색으로 색칠된 칸의 개수 
		board = new String[h+1][w+1];
		int n = board.length;

		int[] dh = {0, 1, -1, 0};
		int[] dw = {1, 0, 0, -1};

		for (int i = 0; i < 4; i++) {
			int h_check = h + dh[i];
			int w_check = w + dw[i];

			if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
				if(board[h][w] == board[h_check][w_check]) {
					answer++;
				}
			}
		}
		return answer;
	}
}
