package theory;

import java.util.ArrayList;
import java.util.Scanner;

//경로탐색(인접리스트, ArrayList)
public class A_0112 {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph; //Integer를 저장할 수 있는ArrayList 객체 저장
	static int[] ch;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0; //백트래킹 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		A_0112 T = new A_0112();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>(); //객체 생성 
		for (int i = 0; i <=n; i++) {
			graph.add(new ArrayList<Integer>());
		} //객체 생성(중요)
		ch = new int[n+1]; //체크 배열 
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b); //a번 ArrayList에 접근 b를 추가 
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}

}
