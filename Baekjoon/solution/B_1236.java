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
				arr[i][j] = input.charAt(j);
			}
		}

		int row = 0; //경비원이 없는 행의 줄 수
		int col = 0; //경비원이 없는 열의 줄 수 
		boolean grd; //경비원이 없는 줄 체크

		for (int i = 0; i < N; i++) {
			grd = true;
			for (int j = 0; j < M; j++) {
				if(arr[i][j] == 'X') {
					grd = false;
					break;
				}
			}
			if(grd) row++;
		}

		for (int i = 0; i < N; i++) {
			grd = true;
			for (int j = 0; j < M; j++) {
				if(arr[i][j] == 'X') {
					grd = false;
					break;
				}
			}
			if(grd) col++;
		}

		answer = Math.max(row, col);
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
