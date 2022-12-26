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
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		int max = 0;
		int n = 0; int m = 0; //행과 열 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					n = i; m = j; //행과 열 위치 
				}
			}
		}
		bw.write(max + "\n");
		//행과 열 위치 출력
		bw.write((n + 1) + " " + (m + 1));
	}
}
