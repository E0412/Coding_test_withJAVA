package theory;

//피보나치 재귀(중요) 
public class S_0104 {
	static int[] fibo; //배열
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n]; //배열의 값을 메모 
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2)+DFS(n-1);
	}
	public static void main(String[] args) {
		S_0104 T = new S_0104();
		int n = 45;
		fibo = new int[n+1];
		T.DFS(n);
		for (int i = 1; i <= n ; i++) 
			System.out.print(fibo[i] + " ");
	}
}
