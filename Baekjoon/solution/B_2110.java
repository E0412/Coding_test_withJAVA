package solution;

import java.io.*;
import java.util.*;

//공유기 설치 
//가장 인접한 두 공유기 사이의 최대 거리를 출력한다
public class B_2110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); //집의 개수
		int C = Integer.parseInt(st.nextToken()); //공유기의 개수
		long result = 0;
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long min = 1; //1부터 시작 
		long max = arr[N-1]; 
		
		//이분 탐색 
		while(min <= max) {
			long mid = (min + max) / 2;
			int cnt = 1; //배치한 공유기의 수 
			int endPosition = arr[0]; //직전에 배치한 공유기의 위치 
			
			//mid 값이 유효한지 확인 
			for (int i = 1; i < arr.length; i++) {
				if(arr[i] - endPosition >= mid) {
					cnt++;
					endPosition = arr[i];
				}
			}
			if(cnt >= C) {
				result = mid; //유효한 값은 result에 저장 
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		System.out.println(result);
	}
}

