package solution;

import java.io.*;

//하얀 칸
public class B_1100 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[][] arr = new String[8][8];
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s[i]; 
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
