package graph;

import java.util.*;

public class graph_1 {
	static int n, m, answer = 0;//static���� �������� ���ο��� ���ٹ޾ƾ� �ؼ� 
	static int[][] graph;
	static int[] ch;
	public void DFS(int v) {
		if(v==n) answer++; //v�� n�� ���� ��� 
		else {
			for(int i = 1; i<=n; i++) { //i�� ���� n���� ���ų� �۾ƾ� 6�� ���� 
				if(graph[v][i]==1 && ch[i]==0) {
					ch[i]= 1;
					DFS(i);
					ch[i]= 0; //üũ Ǯ��					
				}
			}
		}
	}
	public static void main(String[] args) {
		graph_1 G = new graph_1();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		graph = new int[n+1][n+1];//1�� �ε������� n������ ���� ��ȣ�� ���;� �� ��� �� 
		ch = new int[n+1];//�湮 ���� üũ 
		for(int i = 0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b]= 1; //���� �׷��� a���� b�� ���� 1���� ���� 
		}
		ch[1] = 1;
		G.DFS(1);
		System.out.println(answer);
	}

}
