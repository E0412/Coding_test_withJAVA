package solution;

import java.io.*;
import java.util.*;

//단지 번호 붙이기(BFS로 풀이)
/**
 * 1은 집이 있는 곳을, 0은 집이 없는 곳을 의미한다 
 * 첫 번째 줄에는 총 단지수를 출력
 * 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력
 */
public class B2667 {
	
	public static int dx[] = {0, 0, 1, -1};
	public static int dy[] = {1, -1, 0, 0};
	
	public static int N; //입력
	public static int graph[][]; //아파트 단지 배열
	public static boolean visited[][]; //아파트 단지 방문여부
	
	public static int total = 1; //총 단지 수 
	//각 단지의 수를 저장 
	public static ArrayList<Integer> apart = new ArrayList<>(); 
	
	
	//BFS 구현
	public static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{x,y});
		visited[x][y] = true; //방문 처리
		
		while(!q.isEmpty()) {
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		graph = new int[N][N]; //전체 크기
		visited = new boolean[N][N]; //방문 체크 
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				graph[i][j] = s.charAt(j) - '0'; //한 문자만 입력받을 수 있게 형변환 한다
			}
		}
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(graph[i][j] == 1 && !visited[i][j]) {
					total++;
					BFS(i, j); //BFS 실행 
					apart.add(total);
				}
				}
			}
		
		bw.write(apart.size() + "\n"); //총 단지 수 
		
		Collections.sort(apart);
		//각 아파트 단지의 개수 
		for (int i = 0; i < apart.size(); i++) {
			bw.write(apart.get(i) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
