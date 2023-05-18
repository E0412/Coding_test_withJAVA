package solution;

import java.io.*;

//나이트 투어
/* 체스판의 한 칸은 A, B, C, D, E, F 중에서 하나와 
 * 1, 2, 3, 4, 5, 6 중에서 하나를 이어 붙인 것으로 나타낼 수 있다
 * 투어의 경로가 올바르면 Valid, 그렇지않으면 inValid 출력
 */
public class B_1331 {

	//체스판 좌표
	static int dx[] = {1, 2, 2, 1, -1, -2, -2, -1};
	static int dy[] = {2, 1, -1, -2, -2, -1, 1, 2};


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String start = br.readLine();

		bw.flush();
		bw.close();
	}
}
