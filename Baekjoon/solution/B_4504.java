package solution;

import java.io.*;

//배수 찾기
public class B_4504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		//첫 시도는 테스트 수를 제한해서 오답, 테스트 케이스의 수를 제한하지 않게 바꾸니 해결
		while(true) {
			int in = Integer.parseInt(br.readLine());

			if(in == 0) break;
			if(in % N == 0) {
				bw.write(in + " is a multiple of " + N + ".\n");
			} else {
				bw.write(in + " is NOT a multiple of " + N + ".\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
