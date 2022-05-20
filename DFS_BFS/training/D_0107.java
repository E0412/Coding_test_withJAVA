package training;

import java.util.Scanner;

//조합수(메모이제이션)
public class D_0107 {
	public int DFS(int n, int r) {
		if(n==r || r == 0) return 1; //1을 return하는 경우 
		else return DFS(n-1, r-1) + DFS(n-1, r); //조합의 공식
	}
	
	public static void main(String[] args) {
		D_0107 T = new D_0107();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));
	}
}
