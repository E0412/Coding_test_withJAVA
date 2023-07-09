package solution;

import java.io.*;
import java.util.StringTokenizer;

//기숙사 바닥
public class B_2858 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	
	
		int R = Integer.parseInt(st.nextToken()); //빨간색 타일 -> 가장자리
		int B = Integer.parseInt(st.nextToken()); //갈색 타일 수 -> 안의 크기
		int total = R + B;
				
		//방의 크기 
		int L = 0; 
		int W = 0;  

		
		bw.flush();
		bw.close();
	}
}
