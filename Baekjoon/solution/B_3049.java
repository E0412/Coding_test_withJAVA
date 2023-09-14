package solution;

import java.io.*;

//다각형의 대각선
public class B_3049 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		//교자점의 개수 출력
		int answer = (N * (N - 1) * (N - 2) * (N - 3)) / (4 * 3 * 2);	

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
