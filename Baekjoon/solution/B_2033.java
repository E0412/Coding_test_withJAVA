package solution;

import java.io.*;

//반올림
public class B_2033 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int p = 1;
		int ans = 0;

		//정수 N이 10보다 큰 경우, 일의 자리에서 반올림
		while(N > 0) {
			int com = 10;

			if(N > com) {
				int tmp = (int) Math.pow(10, p);
				com *= 10; //자릿수 증가 
			}
		}

		bw.flush();
		bw.close();
	}
}
