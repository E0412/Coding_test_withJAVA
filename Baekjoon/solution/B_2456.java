package solution;

import java.io.*;
import java.util.StringTokenizer;

//나는 학급회장이다
public class B_2456 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[4][4];


		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[1][Integer.parseInt(st.nextToken())]++; //후보 1번
			arr[2][Integer.parseInt(st.nextToken())]++; //후보 2번
			arr[3][Integer.parseInt(st.nextToken())]++; //후보 3번
		}

		//회장 후보 번호와 최고 점수 출력, 결정 못할시 0

		bw.flush();
		bw.close();
	}
}
