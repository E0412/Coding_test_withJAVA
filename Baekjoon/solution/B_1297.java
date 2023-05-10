package solution;

import java.io.*;
import java.util.StringTokenizer;

//TV 크기 
public class B_1297 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int D = Integer.parseInt(st.nextToken()); //TV의 대각선 길이
		int H = Integer.parseInt(st.nextToken()); //TV의 높이 비율
		int W = Integer.parseInt(st.nextToken()); //TV의 너비 비율 
		
		//실제 TV의 높이나 너비 구하기
		//소수점인 경우 내림
		
		bw.flush();
		bw.close();
	}
}
