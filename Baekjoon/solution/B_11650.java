package solution;

import java.io.*;
import java.util.*;

//좌표 정렬하기(Comparator, 람다식 개선)
public class B_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		//두 좌표를 입력 
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1, o2) -> {
				if(o1[0] == o2[0]) { //첫번째 원소가 같다면 두 번째 원소끼리 비교
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
		});
		
		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}
