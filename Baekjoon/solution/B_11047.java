package solution;

import java.io.*;
import java.util.*;

//동전 개수 최솟값 구하기(Greedy)
public class B_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
		}
		
		int cnt = 0;
		for (int i = N - 1; i >= 0; i--) {
			//현재 동전의 가치 arr[i]가 M보다 작거나 같으면 추가 
			if(arr[i] <= M) {
				cnt += (M / arr[i]); //동전수 += 목표금액 / 현재 동전 가치
				M = M % arr[i]; //목표금액 = 목표금액 % 현재 동전 가치
			}
		}
		System.out.println(cnt);
	}
}
