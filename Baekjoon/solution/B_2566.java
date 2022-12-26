package solution;

import java.io.*;
import java.util.*;

//최댓값(2차원 배열)
/*
 * 첫째 줄에 최댓값, 둘째 줄에 최댓값 위치의 행과 열번호 출력 
 */
public class B_2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int[][] arr = new int[9][9];

		int max = 0;
		int n = 0; int m = 0; //행과 열 

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); 

				if(max < arr[i][j]) {
					max = arr[i][j];
					//행과 열 위치
					n = i + 1; 
					m = j + 1;  
				}
			}
		}
		bw.write(max + "\n");
		//행과 열 위치 출력
		bw.write(n + " " + m);
		bw.flush();
		bw.close();
	}
}
