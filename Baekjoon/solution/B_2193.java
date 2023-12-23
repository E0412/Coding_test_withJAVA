package solution;

import java.io.*;

//이친수
/* 이친수는 0으로 시작하지 않는다.
 * 이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
 */
public class B_2193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long[] cnt = new long[91]; //1 ≤ N ≤ 90

		cnt[0] = 0;
		cnt[1] = 1;

		//N자리 이친수의 개수 

		bw.flush();
		bw.close();
	}
}
