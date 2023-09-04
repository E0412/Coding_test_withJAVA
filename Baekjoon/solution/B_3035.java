package solution;

import java.io.*;
import java.util.StringTokenizer;

//스캐너
public class B_3035 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int R = Integer.parseInt(st.nextToken()); //1과 50 사이의 정수
		int C = Integer.parseInt(st.nextToken());
		int ZR = Integer.parseInt(st.nextToken()); //1과 5 사이의 정수 
		int ZC = Integer.parseInt(st.nextToken());

		String[] arr = new String[R];

		//신문기사 입력  
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}

		//R * ZR, C * ZC 만큼 출력한다
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < ZR; j++) {
				for (int k = 0; k < C; k++) {
					for (int l = 0; l < ZC; l++) {
						bw.write(arr[i].charAt(k));
					}
				}
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
