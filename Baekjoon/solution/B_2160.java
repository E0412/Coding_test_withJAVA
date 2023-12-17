package solution;

import java.io.*;

//그림 비교
public class B_2160 {

	static int N;
	static int map[][][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		map = new int[N][5][7];

		//입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				String s = br.readLine();
				for (int k = 0; k < 7; k++) {
					map[i][j][k] = s.charAt(k);
				}
			}
		}
		//그림 비교
		
		bw.flush();
		bw.close();
	}
}
