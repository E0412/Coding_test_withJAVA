package theory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프 최단거리(BFS)
public class B_0113 {
		static int n, m;
		static ArrayList<ArrayList<Integer>> graph;
		static int[] ch, dis;
		
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<Integer>();
		ch[v] = 1;
		dis[v] = 0;
		Q.offer(v);
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) { //방문여부 확인
					ch[nv] = 1;
					Q.offer(nv);
					dis[nv]= dis[cv]+1; 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		B_0113 T = new B_0113();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i = 2; i<=n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
