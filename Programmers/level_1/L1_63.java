package level_1;

//[PCCE 기출문제] 9번 / 이웃한 칸
public class L1_63 {
	public int solution(String[][] board, int h, int w) {
		int answer = 0; //같은 색으로 색칠된 칸의 개수 
		//초기화 배열 삭제, 입력된 배열 이용
		int n = board.length; //행 비교
		int m = board[0].length; //열 비교

		int[] dh = {0, 1, -1, 0};
		int[] dw = {1, 0, 0, -1};

		for (int i = 0; i < 4; i++) {
			int h_check = h + dh[i];
			int w_check = w + dw[i];

			//수정 : w_check는 board[0].length와 비교
			if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < m) {
				//수정 : equals로 비교
				if(board[h][w].equals(board[h_check][w_check])) {
					answer++;
				}
			}
		}
		return answer;
	}
}
