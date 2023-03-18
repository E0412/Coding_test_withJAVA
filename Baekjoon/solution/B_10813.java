package solution;

import java.io.*;
import java.util.StringTokenizer;

//공 바꾸기
public class B_10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); //바구니 개수 
		int M = Integer.parseInt(st.nextToken()); //공을 바꾸는 횟수 

		int arr[] = new int[N];

		for (int i = 0; i < M; i++) {
			st  = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
		}

		bw.flush();
		bw.close();
	}
}
