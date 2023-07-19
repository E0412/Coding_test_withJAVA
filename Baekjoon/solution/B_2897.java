package solution;

import java.io.*;
import java.util.StringTokenizer;

//몬스터 트럭
public class B_2897 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int R = Integer.parseInt(st.nextToken()); //행
		int C = Integer.parseInt(st.nextToken()); //열

		char[][] arr = new char[R][C];

		for (int i = 0; i < R; i++) {
			String in = br.readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = in.charAt(j);
			}
		}

		int zero = 0, one = 0, two = 0, three = 0, four = 0;

		for (int i = 0; i < R - 1; i++) {
			for (int j = 0; j < C - 1; j++) {
				int cnt = 0; //공간의 개수 

				//#인 빌딩은 부술 수 없다
				if(arr[i][j] == '#' || arr[i + 1][j] == '#' || arr[i][j + 1] == '#' || arr[i + 1][j + 1] == '#') 
					continue;

				//2행 2열 탐색
				for (int m = i; m < i + 2; m++) {
					for (int n = j; n < j + 2; n++) {
						//X의 개수만큼 센다
						if(arr[m][n] == 'X') cnt++;

						if(m== i + 1 && n == j + 1) {
							switch (cnt) {
							case 0:
								zero++;
								break;

							case 1:
								one++;
								break;

							case 2:
								two++;
								break;

							case 3:
								three++;
								break;

							case 4:
								four++;
								break;
							}
						}
					}
				}
			}
		}
		bw.write(zero + "\n" + one + "\n" + two + "\n" + three + "\n" + four + "\n");
		bw.flush();
		bw.close();
	}
}
