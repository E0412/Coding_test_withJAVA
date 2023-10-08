package solution;

import java.io.*;

//달팽이
public class B_1913 {
	
	static int N, X;
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, 1, 0, -1};
	static int graph[][];
	
	static void search() {
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine()); 
		X = Integer.parseInt(br.readLine());
		graph = new int[N][N];

		int row = 0;
		int col = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
			}
		}
		
		bw.flush();
		bw.close();
	}
}
