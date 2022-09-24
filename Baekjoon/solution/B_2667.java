package solution;

import java.io.*;
import java.util.*;

//단지 번호 붙이기(DFS)
/**
 * 1은 집이 있는 곳을, 0은 집이 없는 곳을 의미한다 
 * 첫 번째 줄에는 총 단지수를 출력
 * 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력
 */
public class B_2667 {
	
	public static int N; //입력
	//2차원 배열 graph 
	public static int graph[][] = new int[25][25];
	public static int total; //총 단지 수 
	public static int cnt; //단지내 집의 수 
	
	//DFS로 특정 노드를 방문한 후 연결된 모든 노드를 방문 
	public static boolean DFS(int x, int y) {
		//주어진 범위를 벗어나는 경우 종료한다
		if(x < 0 || x >= N || y < 0 || y >= N) {
			return false;
		}
		
		//상, 하, 좌, 우를 살펴본 후 값이 0이면서 방문하지 않은 지점 방문 
		if(graph[x][y] == 0) {
			graph[x][y] = 1; 
			
			//상, 하, 좌, 우의 위치들을 재귀적으로 호출
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
		
		N = Integer.parseInt(br.readLine());
		
		//2차원 리스트의 맵 입력받기
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				graph[i][j] = s.charAt(j) - '0'; //각 문자열을 확인한다 
			}
		}
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				//현재 위치에서 DFS 실행
				if(DFS(i, j)) {
					total++; //방문하지 않은 단지 수++
				}
			}
		}
		bw.write(total + "\n"); //총 단지수 
		bw.flush();
		bw.close();
	}
}

