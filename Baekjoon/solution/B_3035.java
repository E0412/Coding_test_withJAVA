package solution;

import java.io.*;
import java.util.StringTokenizer;

//스캐너
public class B_3035 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		char arr[][] = new char[51][51];
		
		int R = Integer.parseInt(st.nextToken()); //1과 50 사이의 정수
		int C = Integer.parseInt(st.nextToken());
		int ZR = Integer.parseInt(st.nextToken()); //1과 5 사이의 정수 
		int ZC = Integer.parseInt(st.nextToken());
				
		//신문기사 입력  
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (char) br.read();
			}
		}
		
		bw.flush();
		bw.close();
		}
}
