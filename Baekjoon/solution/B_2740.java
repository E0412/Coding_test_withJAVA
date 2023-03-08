package solution;

import java.io.*;
import java.util.StringTokenizer;

//행렬 곱셈
/*
 * N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 
 * 두 행렬을 곱하는 프로그램을 작성한다
 */
public class B_2740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		bw.flush();
		bw.close();
	}
}
