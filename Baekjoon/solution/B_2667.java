package solution;

import java.io.*;
import java.util.*;

//단지 번호 붙이기(DFS)
//1은 집이 있는 곳을, 0은 집이 없는 곳을 의미한다 
public class B_2667 {
	
	public static int N; //입력
	//2차원 배열 graph 
	public static int graph[][];
	public static int cnt;
	
	//DFS로 특정 노드를 방문한 후 연결된 모든 노드를 방문 
	public static boolean DFS(int x, int y) {
		//주어진 범위를 벗어나는 경우 종료한다
		if(x < 0 || x >= N || y < 0 || y >= N) {
			return false;
		}
		
		//현재 노드를 방문하지 않은 경우 
		if(graph[x][y] == 0) {
			graph[x][y] = 1; 
			
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
			}
		}
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				//현재 위치에서 DFS 실행
				if(DFS(i, j)) {
					cnt++;
				}
			}
		}
		//오름차순 정렬
		for (int i = 1; i < graph.length; i++) {
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}
}
