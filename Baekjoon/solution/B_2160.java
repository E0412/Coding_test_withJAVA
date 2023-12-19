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

		int num = 0;
		int min = Integer.MAX_VALUE;
		int x = 0, y = 0;

		//그림 비교
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				num = 0;

				for (int nx = 0; nx < 5; nx++) {
					for (int ny = 0; ny < 7; ny++) {
						//그림이 다른 경우
						if(map[i][nx][ny] != map[j][nx][ny]) {
							num++;
						}
					}
				}
				if(num < min) {
					min = num;
					x = i + 1;
					y = j + 1;
				}
			}
		}
		bw.write(String.valueOf(x + " " + y));
		bw.flush();
		bw.close();
	}
}
