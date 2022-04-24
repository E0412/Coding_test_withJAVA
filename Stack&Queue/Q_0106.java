import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//공주 구하기 
public class Q_0106 {
		public int solution(int n, int k) {
			int answer = 0;
			Queue<Integer> Q = new LinkedList<>();
			for(int i = 1; i<=n; i++) Q.offer(i);
			while(!Q.isEmpty()) { //비어있으면 멈춘다 
				for(int i = 1; i<k; i++) Q.offer(Q.poll());
				Q.poll(); 
				if(Q.size()==1) answer = Q.poll();
			}
			return answer;
		}
	
	public static void main(String[] args) {
		Q_0106 T = new Q_0106();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}

}
