package training;

import java.util.Scanner;

//순열 구하기
public class D_0106 {
	static int[] pm, ch, arr;
	static int n, m;
	public void DFS(int L) {
		if(L==m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i = 0; i < n; i++) {
				if(ch[i]==0) { //i인덱스의 숫자가 쓰이지 않았을 때 
					ch[i] = 1; //체크 
					pm[L]=arr[i]; //사용 
					DFS(L+1); //다음 인덱스로 
					ch[i] = 0; 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		D_0106 T = new D_0106();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) arr[i]=kb.nextInt();
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
	}
}
