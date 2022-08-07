package solution;

import java.io.*;
import java.util.*;

//회의실 배정하기(Greedy)
public class B_1931 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			 st = new StringTokenizer(br.readLine(), " ");
			 arr[i][0] = Integer.parseInt(st.nextToken());
			 arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				//종료 시간이 같을 때 
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		int cnt = 0;
		int end = -1;
		for (int i = 0; i < N; i++) {
			//겹치지 않는 다음 회의가 나온 경우 
			if(arr[i][0] >= end) {
				//종료 시간 업데이트 
				end = arr[i][1];
				cnt++; //진행 가능한 회의 수 증가 
			}
		}
		System.out.println(cnt);
	}
}
