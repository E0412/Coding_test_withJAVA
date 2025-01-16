package solution;

import java.io.*;

//직사각형을 만드는 방법
public class B_8320 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			//가로 * 세로가 주어진 갯수보다 작을동안 다른 한 변의 길이를 1씩 늘리면서 cnt 증가 
			for (int j = i; i * j <= N; j++) {
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
