package training;

import java.util.Scanner;

//동전 교환 
public class D_0105 {
	static int n, m, answer = Integer.MAX_VALUE;
	public void DFS(int L, int sum, int[] arr) {
		if(sum>m) return; //무한루프를 막는 코드 
		if(sum == m) {
			answer = Math.min(answer, L);
		}
		else {
			for(int i = 0; i < n; i++) {
				DFS(L+1, sum+arr[i], arr);
			}
		}
	}
	public static void main(String[] args) {
		D_0105 T = new D_0105();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		m = kb.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
