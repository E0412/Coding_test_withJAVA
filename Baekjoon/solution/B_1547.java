package solution;

import java.io.*;
import java.util.StringTokenizer;

//공
public class B_1547 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = Integer.parseInt(br.readLine()); //컵의 위치를 바꾼 횟수

		for (int i = 1; i <= 50; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());	
			int X = Integer.parseInt(st.nextToken()); //컵 
			int Y = Integer.parseInt(st.nextToken());
			
			//컵의 위치를 바꾼 후 공이 있는 번호 출력
		}

		bw.flush();
		bw.close();
	}
}
