package solution;

import java.io.*;

//아즈텍 피라미드
public class B_7770 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); //블록의 수
		
		//블록 n개로 만들 수 있는 가장 높은 안정적인 피라미드의 높이를 출력
		int height = 1;

		//블럭끼리 맞닿아 있어야 안정적
		
		bw.flush();
		bw.close();
	}
}
