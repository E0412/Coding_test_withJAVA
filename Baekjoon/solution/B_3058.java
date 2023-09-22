package solution;

import java.io.*;
import java.util.StringTokenizer;

//짝수를 찾아라
public class B_3058 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int sum = 0;
			int min = 100; //최솟값

			StringTokenizer st  = new StringTokenizer(br.readLine()); //이 위치가 아니면 오류
			for (int j = 0; j < 7; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num % 2 == 0) {
					sum += num;
					min = Math.min(min, num); //숫자와 최솟값 중 작은 값 저장
				}
			}
			bw.write(sum + " " + min + "\n");
		}
		bw.flush();
		bw.close();
	}
}
