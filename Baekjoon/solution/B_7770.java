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

		int block = 1; //현재 블록의 개수
		int addBlock = 1; //추가된 블록의 개수(최소 개수)

		while(true) {
			block += 4 * height; //현재 높이-1 값을 곱한다
			addBlock += block;

			//블록의 개수를 초과할시 종료
			if(addBlock > N) break;

			height++;
		}
		bw.write(height + "");
		bw.flush();
		bw.close();
	}
}
