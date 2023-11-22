package solution;

import java.io.*;

//-2진수
public class B_2089 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		if(N == 0) {
			bw.write(0 + "");
			bw.flush();
		} else {
			while(Math.abs(N) >= 1) { //절댓값 N이 1이상인경우 반복 
				sb.append(Math.abs(N % -2)); //나머지의 절댓값 저장
				N = (int)(Math.ceil(N/ -2.0));
			}
			bw.write(sb.reverse() + "");
			bw.flush();
		}
		bw.close();
	}
}
