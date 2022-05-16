package training;

import java.util.Scanner;

//중복순열
public class D_0104 {
	static int[] pm;
	static int n, m;
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i = 1; i <= n; i++) { //n번의 호출 
				pm[L] = i; 
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args) {
		D_0104 T = new D_0104();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m]; //배열의 크기 
		T.DFS(0);
	}
}
