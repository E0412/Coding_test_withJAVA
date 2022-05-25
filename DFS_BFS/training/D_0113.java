package training;

import java.util.Scanner;

//섬나라 아일랜드(DFS)
public class D_0113 {
	static int answer = 0, n;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1}; //8방향 
	
	public void DFS(int x, int y, int[][] board) {
		for (int i = 0; i < 8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
				//경로 이탈을 막는 조건문, board가 1이어야 한다**
				board[nx][ny]=0;
				DFS(nx, ny, board);
			}
		}
	}
	
	public void solution(int[][] board) { //DFS의 횟수를 세는 메서드
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j]==1) {
					answer++;
					board[i][j]=0; 
					DFS(i, j, board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		D_0113 T = new D_0113();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //answer
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]= kb.nextInt(); 
			}
		}
		T.solution(arr);
		System.out.println(answer);
	}
}
