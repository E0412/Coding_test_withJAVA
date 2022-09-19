package training;

import java.io.*;
import java.util.StringTokenizer;

//음료수 얼려 먹기(DFS)
//얼음이 채워지는 틀은 0 칸막이는 1 
public class D_1119 {
	
	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	//DFS로 특정 노드를 방문 후 연결된 모든 노드를 방문한다 
	public static boolean DFS(int x, int y) {
		//주어진 범위를 벗어나는 경우 종료
		if(x < 0 || x >= n || y < 0 || y >= m) {
			return false;
		}
		//현재 노드를 방문하지 않은 경우
		if(graph[x][y] == 0) {
			//해당 노드를 방문처리한다 
			graph[x][y] = 1;
			
			//현재 연결요소에 포함된 모든 노드들을 방문처리한다 
			//-> 상, 하, 좌, 우의 위치들을 재귀적으로 호출
			DFS(x - 1, y); //좌
			DFS(x + 1, y); //우
			DFS(x, y + 1); //상
			DFS(x, y - 1); //하 
			return true; //방문 처리 
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//공백을 기준으로 입력받는다
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		//2차원 리스트의 맵 입력받기
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = s.charAt(j) - '0'; //각 문자열을 확인한다 
				//-> 정수형 데이터가 2차원 배열에 담길 수 있도록 만든다 
			}
		}
		
		//모든 노드(위치)에 대하여 음료수 채우기
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				//현재 위치에서 DFS 실행
				if(DFS(i, j)) {
					cnt++;
				}
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
