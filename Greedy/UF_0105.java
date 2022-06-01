import java.util.Scanner;

//친구인가? (Disjoint-Set : Union&Find)
public class UF_0105 {
	static int[] unf; //전역변수, 1차원 배열의 인덱스번호  
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
		int n = kb.nextInt();
		int m = kb.nextInt();
		unf = new int[n+1];
		for (int i = 1; i <= n; i++) unf[i] = i; 
		for (int i = 1; i <= m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			Union(a, b); //a와 b를 합집합으로 만든다
		}
		int a = kb.nextInt();
		int b = kb.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa==fb) System.out.println("YES");
		else System.out.println("NO");
	}
}
