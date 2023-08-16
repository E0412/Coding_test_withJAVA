package solution;

import java.io.*;
import java.util.StringTokenizer;

//영식이와 친구들
public class B_1592 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int answer = 0; //전체 횟수 
		int[] cnt = new int[N + 1]; //공을 받은 횟수
		
		bw.flush();
		bw.close();
	}
}
