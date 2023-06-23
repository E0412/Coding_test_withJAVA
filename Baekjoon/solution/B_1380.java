package solution;

import java.io.*;
import java.util.StringTokenizer;

//귀걸이 
/*
 * 시나리오 번호와 귀걸이를 돌려받지 못한 여학생의 이름을 공백으로 구분하여 한 줄씩 출력
 */
public class B_1380 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine()); //여학생의 수
		String name = ""; //여학생들의 이름 

		for (int i = 0; i < cnt; i++) {
			name = br.readLine();
		}

		//여학생 번호와 'A'또는 'B' 입력 
		StringTokenizer st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < 2*cnt - 1; i++) {

		}

		bw.flush();
		bw.close();
	}
}
