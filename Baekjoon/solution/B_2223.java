package solution;

import java.io.*;
import java.util.StringTokenizer;

//금화
public class B_2223 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int t = Integer.parseInt(st.nextToken()); //총 시간
		int x = Integer.parseInt(st.nextToken()); //담을 수 있는 금화 갯수
		int m = Integer.parseInt(st.nextToken()); 

		int result = 0;

		for (int i = 0; i < m; i++) {
			st  = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken()); //몬스터 거리
			int s = Integer.parseInt(st.nextToken()); //움직이는 거리
			//담을 수 있는 금화의 최대 개수 구하기
		}
		bw.flush();
		bw.close();
	}
}
