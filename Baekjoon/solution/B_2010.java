package solution;

import java.io.*;

//플러그
public class B_2010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); //멀티탭의 개수
		int result = 1;  //최대로 전원에 연결될 수 있는 컴퓨터의 수, 기본 하나의 플러그

		for (int i = 0; i < N; i++) {
			int in = Integer.parseInt(br.readLine());
			result += in;
		}
		result -= N; //멀티탭의 개수만큼 -1을 한다 
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
