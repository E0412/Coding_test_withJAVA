package solution;

import java.io.*;


//창영마을
/* 공이 가장 왼쪽 컵에 있으면 1, 중앙에 있는 컵에 있으면 2, 
 * 오른쪽에 있는 컵에 있으면 3을 출력한다.
 */
public class B_3028 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		boolean[] po = new boolean[3]; //공의 위치
		po[0] = true;

		for (int i = 0; i < input.length(); i++) {
			//1번 2번 위치를 교환하는 경우
			if(input.charAt(i) == 'A') {
				if(po[0] == true) {
					po[0] = false; //교환된 위치를 false로 바꾼다
					po[1] = true;
				} else if(po[1] == true) {
					po[0] = true;
					po[1] = false;
				}
			} //괄호 위치 수정

			//2번 3번 위치를 교환하는 경우
			else if(input.charAt(i) == 'B') {	
				if(po[1] == true) {
					po[1] = false;
					po[2] = true;
				} else if(po[2] == true) {
					po[1] = true;
					po[2] = false;
				}
			}

			//1번 3번 위치를 교환하는 경우
			else if(input.charAt(i) == 'C') {
				if(po[0] == true) {
					po[0] = false;
					po[2] = true;
				} else if(po[2] == true) {
					po[0] = true;
					po[2] = false;
				}
			}
		}

		if(po[0]) bw.write(1 + "");
		if(po[1]) bw.write(2 + "");
		if(po[2]) bw.write(3 + "");

		bw.flush();
		bw.close();
	}
}
