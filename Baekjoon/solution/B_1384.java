package solution;

import java.io.*;

//메시지
/*  나쁜 말이 여러 개라면, 입력받은 순서대로 출력
 *  아무도 나쁜 말을 하지 않았다면 "Nobody was nasty"를 출력
 */
public class B_1384 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = 0; //그룹번호

		while(true) {
			int N = Integer.parseInt(br.readLine());

			if(N == 0) {
				break;
			}

			String[] arr = new String[N];
			for (int i = 0; i < N; i++) {
				arr[i] = br.readLine();
			}

			String[][] name = new String[N][N];

			for (int i = 0; i < N; i++) {
				name[i] = arr[i].split(" "); //공백 구분 입력
			}
			cnt++; 
			bw.write("Group " + cnt + "\n"); //그룹번호 출력

			int check = 0; //값이 0이면 Nobody was nasty 출력

			for (int i = 0; i < N; i++) {
				for (int j = 1; j < N; j++) {
					if(name[i][j].equals("N")) check++;
				}
			}
			if(check == 0) {
				bw.write("Nobody was nasty");
			}
			//누가 누구에게 나쁜말을 했는지 출력
			else {

			}
			bw.write("\n"); //그룹을 공백으로 구분
		}
		bw.flush();
		bw.close();
	}
}
