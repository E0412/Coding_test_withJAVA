package training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//동전 교환 
public class D_0105 {
	static int n, m, answer = Integer.MAX_VALUE;
	public void DFS(int L, int sum, Integer[] arr) {
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
		Integer[] arr = new Integer[n];
		for(int i =0 ; i<n; i++) arr[i] = kb.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());//내림차순
		m = kb.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
