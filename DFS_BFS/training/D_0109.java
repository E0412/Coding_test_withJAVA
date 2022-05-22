package training;

import java.util.Scanner;

//조합 구하기
public class D_0109 {
	static int[] combi;
	static int n, m;
	public void DFS(int L, int s) {
		if(L==m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i=s; i<=n; i++) {
				combi[L]= i;
				DFS(L+1, i+1);
			}
		}
	}
	public static void main(String[] args) {
		D_0109 T = new D_0109();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1); //레벨, 스타트 번호 
	}
}
