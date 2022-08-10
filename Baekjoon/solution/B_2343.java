package solution;

import java.io.*;
import java.util.*;

//블루레이 만들기 
public class B_2343 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		int start = 0;
		int end = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
			//레슨 최댓값을 시작 인덱스로 저장
			if(start < arr[i])  start = arr[i];
			//모든 레슨의 총합을 종료 인덱스로 저장
			end = end + arr[i];
		}
		while(start <= end) {
			int mid = (start + end) / 2; //중간지점
			int sum = 0;
			int cnt = 0;
			//중간값으로 모든 레슨의 저장이 가능한지 확인
			for (int i = 0; i < N; i++) {
				if(sum + arr[i] > mid) {
					cnt++;
					sum = 0;
				}
				sum += arr[i];
			}
			//탐색 후 sum이 0이 아니면 cnt++
			if(sum != 0) cnt++;
			//중간 인덱스 값으로 모든 레슨 저장 불가 
			if(cnt > M) start = mid + 1;
			//중간 인덱스 값으로 모든 레슨 저장 가능
			else end = mid - 1;
		}
		System.out.println(start);
	}
}
