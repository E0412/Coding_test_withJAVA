package solution;

import java.io.*;
import java.util.*;

//나무 자르기(이분탐색 - upper bound 활용)
public class B_2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//입력받은 나무들의 높이가 저장되어있는 배열(정렬할 필요x)
		int[] tree = new int[N];
		
		int min = 0;
		int max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			
			//최댓값을 구하기 위해 입력때마다 max 변수와 비교 
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		//이진 탐색
		while(min < max) {
			int mid = (min + max) / 2; //자르는 위치
			long sum = 0; //잘린 나무의 길이 합 
			
			for(int height : tree) {
				//잘린 나무의 길이 = 높이 - 위치(mid)
				if(height - mid > 0) {
					sum += (height - mid);
				}
			}
			
			//잘린 길이의 합이 M보다 작은경우 높이를 낮춰야한다 -> max를 줄인다
			if(sum < M) {
				max = mid;
			}
			//길이의 합이 M보다 큰 경우 높이를 높혀야한다 -> min을 높힌다 
			else {
				min = mid + 1;
			}
		}
		System.out.println(min - 1);
	}
}
