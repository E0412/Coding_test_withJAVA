package solution;

import java.io.*;
import java.util.StringTokenizer;

//성 지키기 
public class B_1236 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int answer = 0;
		
		char[][] arr = new char[N][M];
		for (int i = 0; i < N; i++) {
			String input = br.readLine(); 
			for (int j = 0; j < M; j++) {

			}
		}

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
