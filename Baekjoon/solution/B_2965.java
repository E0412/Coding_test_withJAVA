package solution;

import java.io.*;
import java.util.StringTokenizer;

//캥거루 세마리
public class B_2965 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		//캥거루 초기위치
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		//A, B, C 캥거루의 거리 값 중 큰 값을 저장한다(제일 많이 뛰기 위해) 
		int max = Math.max((C - B), (B - A)); 

		bw.write(max - 1 + ""); //두 캥거루 사이로 이동하기 때문에 -1을 한다 
		bw.flush();
		bw.close();
	}
}
