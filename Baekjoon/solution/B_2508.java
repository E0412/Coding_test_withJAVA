package solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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

			//사탕의 개수 출력 
		}

		bw.flush();
		bw.close();
	}
}
