package solution;

import java.io.*;
import java.util.StringTokenizer;

//인공지능 시계
public class B_2530 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); //시
		int B = Integer.parseInt(st.nextToken()); //분
		int C = Integer.parseInt(st.nextToken()); //초
		int D = Integer.parseInt(st.nextToken()); //요리하는데 필요한 시간
		
		//종료되는 시각의 시, 분, 초를 출력
		
		bw.flush();
		bw.close();
	}
}
