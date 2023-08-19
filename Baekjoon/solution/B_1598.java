package solution;

import java.io.*;
import java.util.StringTokenizer;

//꼬리를 무는 숫자 나열
public class B_1598 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int x1, x2, y1, y2; //좌표
		
		//입력값이 4의 배수인 경우
		if(N % 4 == 0) {
			x1 = (N / 4);
			y1 = 1; 
		} 
		//4의 배수가 아닌 경우
		else {
			x1 = (N / 4) + 1;
			y1 = 5 - (N % 4);
		}
		
		bw.flush();
		bw.close();
	}
}
