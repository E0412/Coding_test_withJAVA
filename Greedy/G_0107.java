import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//원더랜드(프림 : PriorityQueue)
class Edge2 implements Comparable<Edge2> {
	public int vex; //정점
	public int cost; //비용
	Edge2(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge2 o) {
		return this.cost - o.cost; //오름차순, 작은 값을 우선순위로 
	}
}
public class G_0107 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		ArrayList<ArrayList<Edge2>> graph = new ArrayList<ArrayList<Edge2>>();
		for(int i = 0; i<=n; i++) {
			graph.add(new ArrayList<Edge2>());
		}
		int[] ch = new int[n+1];
		for(int i = 0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge2(b, c)); //a라는 정점에서 b라는 정점으로 가는데에 c라는 비용이 든다
			graph.get(b).add(new Edge2(a, c)); 
		}
		int answer = 0;
		PriorityQueue<Edge2> pQ = new PriorityQueue<Edge2>();
		pQ.offer(new Edge2(1, 0)); //1번 정점부터 출발
		while(!pQ.isEmpty()) {
			Edge2 tmp = pQ.poll(); //꺼낸다 
			int ev = tmp.vex; //ev = 도착정점 
			if(ch[ev]==0) { //체크가 안됐을때만 선택
				ch[ev]=1;
				answer += tmp.cost;
				for(Edge2 ob : graph.get(ev)) {
					if(ch[ob.vex]==0) pQ.offer(new Edge2(ob.vex, ob.cost)); //비용할당
				} //연결된 정보 탐색 
			}
		}
		System.out.println(answer);
	}
}
