package training;

import java.util.Scanner;

//합이 같은 부분집합 
public class D_0101 {
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	public void DFS(int L, int sum, int[] arr) {//레벨, 총합, 배열
		if(flag) return;
		if(sum>total/2) return; 
		if(L==n) { //레벨탐색
			if((total - sum) == sum) { //total의 중간 값 
				answer = "YES"; 
				flag = true; //넘어오는 재귀를 return 
			}
		} 
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr); //부분집합
		}
	}
	public static void main(String[] args) {
		D_0101 T = new D_0101();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); //static int n
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
