package solution;

import java.io.*;
import java.util.StringTokenizer;

//사탕 박사 고창영
public class B_2508 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			br.readLine();

			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			char[][] arr = new char[r][c];

			//배열 할당
			for (int a = 0; a < r; a++) {
				String s = br.readLine();
				for (int b = 0; b < c; b++) {
					arr[a][b] = s.charAt(b);
				}
			}

			int cnt = 0;
			for (int a = 0; a < r; a++) {
				for (int b = 0; b < c - 2; b++) {
					if(arr[a][b] == '>' && arr[a][b + 1] == 'o' 
							&& arr[a][b + 2] == '<') {
						cnt++;
					}
				}
			}

			for (int a = 0; a < c; a++) {
				for (int b = 0; b < r - 2; b++) {
					if(arr[a][b] == 'v' && arr[a + 1][b] == 'o' 
							&& arr[a + 2][b] == '^') {
						cnt++;
					}	
				}
			}
			bw.write(cnt + "");
		}
		bw.flush();
		bw.close();
	}
}
