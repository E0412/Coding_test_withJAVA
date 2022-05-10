package theory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//송아지 찾기(BFS)
public class S_0108 {
	int answer = 0; //최소 횟수
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<Integer>();
	
	public int BFS(int s, int e) {
		ch= new int[10000];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size(); //크기 구하기
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 0; j < 3; j++) {
					int nx = x+dis[j];
					if(nx==e) return L+1;
					if(nx>=1 && nx<=10000 && ch[nx]==0) {//방문 안한 지점 체크
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}
	public static void main(String[] args) {
		S_0108 T = new S_0108();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(T.BFS(s, e));
	}
}
