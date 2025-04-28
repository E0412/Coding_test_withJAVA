package solution;

import java.io.*;
import java.util.StringTokenizer;

//싸이클
public class B_2526 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		int sum = N;
		int cnt = 0;
		int[] arr = new int[P + 1]; //서로 다른 수의 개수
		boolean chk = false;

		while(!chk) {
			sum = N * sum % P;

			//반복 체크
			for (int i = 0; i < cnt; i++) {
				if(arr[i] == sum) {
					chk = true;
					bw.write(String.valueOf(cnt - i));
					break;
				}
			}
			arr[cnt] = sum; //반복되지 않은 경우
			cnt++; 
		}
		bw.flush();
		bw.close();
	}
}
