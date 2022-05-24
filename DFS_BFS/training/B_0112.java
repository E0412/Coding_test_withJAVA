package training;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//토마토(BFS)
class Point2 {
	public int x, y;
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class B_0112 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	static int n, m;
	static Queue<Point2> Q = new LinkedList<Point2>(); //메인메서드에서도 접근
	
	public void BFS() { //2차원 배열
		while(!Q.isEmpty()) {
			Point2 tmp = Q.poll(); //꺼낸다 
			for(int i = 0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=0 && nx <n && ny>=0 && ny<m && board[nx][ny]==0) {
					board[nx][ny]=1; //체크
					Q.offer(new Point2(nx, ny)); //Q에 할당
					dis[nx][ny]=dis[tmp.x][tmp.y]+1; //dis위치 +1 
				}
			}
		}
	}
	public static void main(String[] args) {
		B_0112 T = new B_0112();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		board = new int[n][m];
		dis = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <m; j++) {
				board[i][j]=kb.nextInt();
				if(board[i][j]==1) Q.offer(new Point2(i, j)); 
			}
		}//출발점이 여러개 일 때 미리 queue에 할당해야한다 
		
		T.BFS(); //BFS 호출 
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(board[i][j]==0) flag = false; 
			}
		} //2중 for문으로 board탐색 
		
		if(flag) { //true일 때
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		}
		else System.out.println(-1);
	}
}
