import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//원더랜드(최소 스패닝 트리 : 크루스칼, Union&Find)
class Edge implements Comparable<Edge> { //간선 정보
	public int v1; //정점1
	public int v2; //정점2
	public int cost;
	Edge(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		return this.cost-o.cost; //오름차순 정렬 
	}
}
public class UF_0106 {
	static int[] unf;
	public static int Find(int v) {
		if(v==unf[v]) return v;
		else return unf[v] = Find(unf[v]); //집합 번호를 return 
	}
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //정점 개수
		int m = kb.nextInt(); //간선 개수
		unf = new int[n+1];
		ArrayList<Edge> arr = new ArrayList<Edge>();
		for (int i = 1; i <= n; i++) unf[i] = i; 
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Edge(a, b, c));
	}
	int answer = 0;
	Collections.sort(arr);
	for(Edge ob : arr) {
		int fv1 = Find(ob.v1);
		int fv2 = Find(ob.v2);
		if(fv1!=fv2) {
			answer += ob.cost;
			Union(ob.v1, ob.v2); //합집합 
		}
	}
	 System.out.println(answer);
}
}