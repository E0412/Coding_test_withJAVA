package solution;

import java.io.*;

//거북이
public class B_8911 {

	static int dx[] = {-1, 0, 0, 1};
	static int dy[] = {0, 1, -1, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String s = br.readLine();

			int x = 0; int y = 0; int move = 0;
			int min_x = x, max_x = x, min_y = y, max_y = y; 

			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);

				//한 눈금 앞으로
				if(ch == 'F') {
					x += dx[move];
					y += dy[move];
				} 
				//한 눈금 뒤로
				else if(ch == 'B') {
					x -= dx[move];
					y -= dy[move];
				}
				//왼쪽으로 90도 회전
				else if(ch == 'L') {

				}
				//오른쪽으로 90도 회전
				else if(ch == 'R') {

				}
			}

		}
		System.out.println(sb.toString());
	}
}
