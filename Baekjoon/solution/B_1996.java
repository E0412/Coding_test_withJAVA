package solution;

import java.io.*;

//지뢰 찾기
/*
 * '.'는 지뢰가 없는 것이고 숫자는 지뢰가 있는 경우로 그 칸의 지뢰의 개수이다
 * 숫자 또는 'M' 또는 '*'로만 이루어져 있는 완성된 map을 출력한다.
 */
public class B_1996 {

	static int dx[] = {-1, 0, 1, -1, 1, -1, 0, 1};
	static int dy[] = {-1, -1, -1, 0, 0, 1, 1, 1};
	static char tmp[][]; //지뢰 상태
	static char map[][]; //결과
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		tmp= new char[N][N];
		map = new char[N][N];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				tmp[i][j] = s.charAt(j); 
			}
		}
		
		//지뢰 탐색
		
		bw.flush();
		bw.close();
	}
}
