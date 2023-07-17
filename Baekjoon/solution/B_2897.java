package solution;

import java.io.*;
import java.util.StringTokenizer;

//몬스터 트럭
public class B_2897 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int R = Integer.parseInt(st.nextToken()); //행
		int C = Integer.parseInt(st.nextToken()); //열

		char[][] arr = new char[R][C];

		for (int i = 0; i < R; i++) {
			String in = br.readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = in.charAt(j);
			}
		}
		
		//아무차도 부수지 않으면서 주차할 수 있는 공간의 개수 

		bw.flush();
		bw.close();
	}
}
