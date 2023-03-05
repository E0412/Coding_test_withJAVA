package solution;

import java.io.*;

//하얀 칸
public class B_1100 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = new String[8];
		int cnt = 0;

		for (int i = 0; i < 8; i++) { 
			arr[i] = br.readLine();
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				//짝수번 줄, 짝수 번호인 경우 cnt++
				if(i % 2 == 0 && j % 2 == 0 && arr[i].charAt(j) == 'F') {
					cnt++;
				} 
				//홀수번 줄, 홀수 번호인 경우 cnt++
				else if(i % 2 == 1 && j % 2 == 1 && arr[i].charAt(j) == 'F') {
					cnt++;
				}
			}
		}

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
