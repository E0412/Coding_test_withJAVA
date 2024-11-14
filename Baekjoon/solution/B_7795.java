package solution;

import java.io.*;
import java.util.StringTokenizer;

//먹을 것인가 먹힐 것인가
public class B_7795 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int A[] = new int[N];
			int B[] = new int[M];
			
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				A[j] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				B[j] = Integer.parseInt(st.nextToken());
			}
			
			// A가 B보다 큰 쌍의 개수를 출력
		}
		
		bw.flush();
		bw.close();
		}
}
