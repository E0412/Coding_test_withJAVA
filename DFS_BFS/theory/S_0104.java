package theory;

//피보나치 재귀(중요) 
public class S_0104 {
	public int DFS(int n) {
		if(n==1) return 1;
		else if(n==2) return 1;
		else return DFS(n-2)+DFS(n-1);
	}
	public static void main(String[] args) {
		S_0104 T = new S_0104();
		int n = 10;
		for (int i = 0; i <= n ; i++) 
			System.out.println(T.DFS(i) + " ");
	}
}
