package theory;

//팩토리얼
public class R_0103 {
	public int DFS(int n) {
		if(n == 1) return 1;
		else return n*DFS(n-1);
	}
	
	public static void main(String[] args) {
		R_0103 T = new R_0103();
		System.out.println(T.DFS(6));
	}
}
