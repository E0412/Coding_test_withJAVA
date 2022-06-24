package solution;

import java.io.*;
import java.util.*;

//구간 합 구하기 2차원 배열 
public class B_11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //데이터의 개수
		int M = Integer.parseInt(st.nextToken()); //배열의 개수 
		
		//배열 구하기 
		int[][] arr = new int[N+1][N+1];//인덱스를 1부터 세기위해 총 인덱스 +1
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		//합배열 구하기
		int[][] Sarr = new int[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				Sarr[i][j] = Sarr[i-1][j]+Sarr[i][j-1]-Sarr[i-1][j-1]+arr[i][j];
			}
		}
		
		//구간 합 구하기 
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int result = Sarr[x2][y2]-Sarr[x1-1][y2]-Sarr[x2][y1-1]+Sarr[x1-1][y1-1];
			System.out.println(result);
		}
	}
}
