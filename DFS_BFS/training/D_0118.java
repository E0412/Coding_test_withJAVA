package training;

import java.io.*;
import java.util.*;

//친구 관계 파악하기
public class D_0118 {
	
	static boolean visited[];
	static ArrayList<Integer>[] arr;
	static boolean arrive;
	
	//DFS 구현 
	public static void DFS(int now, int depth) {
		//깊이가 5가되면 종료 
		if(depth == 5 || arrive) {
			arrive = true;
			return;
		}
		visited[now] = true;
		for(int call : arr[now]) {
			if(!visited[call]) {
				DFS(call, depth + 1); //재귀 호출 될 때 마다 깊이 1 증가 
			}
		}
		visited[now] = false;
	}
	
	public static void main(String[] args) throws IOException {
		int node;
		int edge;
		arrive = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		node = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		arr = new ArrayList[node];
		visited = new boolean[node];
		
		for (int i = 0; i < node; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		//배열의 인접리스트에 그래프 데이터 저장
		for (int i = 0; i < edge; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			arr[N].add(M);
			arr[M].add(N);
		}
		
		//노드마다 DFS 실행
		for (int i = 0; i < node; i++) {
			DFS(i, 1);
			if(arrive) break;
		}
		if(arrive) System.out.println("1");
		else System.out.println("0"); //5의 깊이가 없는 경우 
	}
}
