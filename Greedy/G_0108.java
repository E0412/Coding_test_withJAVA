import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//다익스트라 알고리즘
class Edge3 implements Comparable<Edge3> {
	public int vex; //정점
	public int cost; //비용(가중치 값)
	Edge3(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge3 o) {
		return this.cost-o.cost; //오름차순 -> 가장 작은값을 poll한다
	}
	
}
public class G_0108 {
	static int n, m;
	static ArrayList<ArrayList<Edge3>> graph;//가중치 방향 그래프 -> 객체 저장
	static int[] dis;
	public void solution(int v) { //v = 1일 때
		PriorityQueue<Edge3> pQ = new PriorityQueue<Edge3>();
		pQ.offer(new Edge3(v, 0)); //(1, 0)
		dis[v]=0;
		while(!pQ.isEmpty()) { //다익스트라 반복 
			Edge3 tmp = pQ.poll(); //(1,0) poll
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost > dis[now]) continue; //큰 값이 나오면 반복문x
			for(Edge3 ob : graph.get(now)) {
				if(dis[ob.vex] > nowCost+ob.cost) {
					dis[ob.vex]=nowCost+ob.cost;
					pQ.offer(new Edge3(ob.vex, nowCost+ob.cost));
				}
			}
		}
	}
	public static void main(String[] args) {
		G_0108 T = new G_0108();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //정점의 개수
		m = kb.nextInt(); //간선의 개수
		graph  = new ArrayList<ArrayList<Edge3>>(); 
		//객체를 저장하는 ArrayList를 저장하는 ArrayList
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge3>()); //객체 n개를 만들어낸다 
		}
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i = 0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge3(b, c));
		} //a번 정점에서 b번 정점으로 가는 비용이 c이다 
		T.solution(1); //1번 정점에서 출발
		for(int i = 2; i<=n; i++) {
			if(dis[i]!= Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
			else System.out.println(i + " : impossible");
		}
	}
}
