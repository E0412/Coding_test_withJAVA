package solution;

import java.io.*;
import java.util.StringTokenizer;

//윷놀이
public class B_2490 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < 3; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());
			int cnt = 0;
			int[] arr = new int[4];

			for (int j = 0; j < 4; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				if(arr[j] == 1) cnt++; //등이 나오는 경우 더해준다 
			}
			//등이 없는 경우 = 윷 = D
			if(cnt == 0) {
				bw.write("D\n");
			} 
			//등이 1개, 배 3개 = 걸 = C
			else if(cnt == 1) {
				bw.write("C\n");
			} 
			//등이 2개, 배 2개 = 개 = B
			else if(cnt == 2) {
				bw.write("B\n");
			} 
			//등이 3개, 배 1개 = 도 = A
			else if(cnt == 3) {
				bw.write("A\n");
			} 
			//등이 4개 = 모 = E
			else if(cnt == 4) {
				bw.write("E\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
