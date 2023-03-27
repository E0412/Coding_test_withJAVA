package solution;

import java.io.*;
import java.util.StringTokenizer;

//줄 세우기
public class B_2605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine()); //학생의 수 
		
		StringTokenizer st  = new StringTokenizer(br.readLine());	
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(st.nextToken());
		}
		
		bw.flush();
		bw.close();
	}
}
