package training;

import java.util.Scanner;

//수열 추측하기(메모이제이션, DFS)
public class D_0108 {
	static int[] b, p, ch;
	static int n, f;
	boolean flag = false;
	int[][] dy = new int[35][35];
	public int combi(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(n == r || r == 0) return 1;
		else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
	} //메모이제이션 
	
	public void DFS(int L, int sum) {
		if(flag) return;
		if(L == n) {
			if(sum == f) {
				for (int x : p) System.out.print(x + " ");
					flag = true;
			}
		}
		else {
			for(int i = 1; i<=n; i++) { //순열을 만드는 숫자 i
				if(ch[i]==0) {
					ch[i] = 1; //순열의 데이터
					p[L] = i;
					DFS(L+1, sum+(p[L]*b[L])); //p[0]*b[0]
					ch[i] = 0; //체크 해제 
				}
			}
		}
	}
	public static void main(String[] args) {
		D_0108 T = new D_0108();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		for (int i = 0; i < n; i++) {
			b[i] = T.combi(n-1, i);
		}
		T.DFS(0, 0);
	}
}
