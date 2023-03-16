package solution;

import java.io.*;
import java.util.StringTokenizer;

//공 넣기(1차원 배열)
/*
 * 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력
 */
public class B_10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //바구니 개수
		int M = Integer.parseInt(st.nextToken()); //공을 넣는 횟수
		int arr[]  = new int[M];
		
		for (int i = 0; i < M; i++) {
			st  = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		bw.flush();
		bw.close();
	}
}
