package solution;

import java.io.*;
import java.util.*;

//색종이(2차원 배열)
/*
 * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지
 * 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이 출력 
 */
public class B_2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine()); //색종이의 수 
		int[][] arr = new int[100][100]; //색종이의 위치 
		int result = 0; //색종이가 붙은 검은 영역의 넓이 

		//그래프 할당 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			for (int a = n; a < n + 10; a++) {
				for (int b = m; b < m + 10; b++) {
					arr[a][b] = 1; 
				}
			}
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) 
					result++;
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
