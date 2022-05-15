package training;

import java.util.Scanner;

//바둑이 승차 
public class D_0102 {
	static int answer = Integer.MIN_VALUE, c, n;
	
	public void DFS(int L, int sum, int[] arr) {
		if(sum > c) return;
		if(L == n) { //sum <= c 부분집합 
			answer = Math.max(answer, sum);
		} 
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
		
	
	public static void main(String[] args) {
		D_0102 T = new D_0102();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt(); //static int c
		n = kb.nextInt(); //static int n
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
