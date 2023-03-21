package solution;

import java.io.*;
import java.util.StringTokenizer;

//바구니 뒤집기 
/*
 * 바구니의 순서를 역순으로 바꾸고 모든 순서를 출력
 */
public class B_10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken()); //바구니 개수 
		int M = Integer.parseInt(st.nextToken()); //공을 바꾸는 횟수 

		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < M; i++) {
			st  = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
		}
		
		bw.flush();
		bw.close();
	}
}
