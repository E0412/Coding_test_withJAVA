package solution;

import java.io.*;
import java.util.StringTokenizer;

//피시방 알바
public class B_1453 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[100]; //자릿수 100개로 고정

		int cnt = 0; //거절당하는 사람의 수 

		StringTokenizer st  = new StringTokenizer(br.readLine());	
		for (int i = 0; i < N; i++) {
			int m = Integer.parseInt(st.nextToken());

			if(arr[m] == true) {
				cnt++;
			} else {
				arr[m] = true;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
