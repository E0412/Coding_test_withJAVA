package solution;

import java.io.*;
import java.util.*;

//연결 요소의 개수(DFS)
/*
 * 무방향 그래프에서의 연결요소 개수 구하기
 */
public class B_11724 {
	
	static ArrayList<Integer>[] lists; //그래프 데이터 저장 인접리스트
	static boolean visited[]; //방문 기록 저장 배열
	
	//DFS 구현
	static void DFS(int input) {
		//현재 노드 == 방문 노드
		if(visited[input]) {
			return;
		}
		visited[input] = true; //현재 노드 방문 저장 
		for(int i : lists[input]) {
			//연결 노드 중 방문하지 않은 노드만 탐색 
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		lists = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		//인접 리스트 초기화 
		for (int i = 1; i < N + 1; i++) {
			lists[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()); //간선 시작점
			int end = Integer.parseInt(st.nextToken()); //간선 끝
			
			//양방향 간선이므로 양쪽에 간선 더하기 
			lists[start].add(end);
			lists[end].add(start);
		}
		int cnt = 0;
		for (int i = 1; i < N + 1; i++) {
			//방문하지 않은 노드가 없을때까지 반복 
			if(!visited[i]) {
				cnt++;
				DFS(i);
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
