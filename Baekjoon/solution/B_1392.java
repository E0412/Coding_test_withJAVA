package solution;

import java.io.*;
import java.util.StringTokenizer;

//노래 악보
public class B_1392 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); //악보 수
		int Q = Integer.parseInt(st.nextToken()); //질문의 개수

		int time[] = new int[Q];

		for (int i = 0; i < Q; i++) {
			time[i] = Integer.parseInt(br.readLine()); //시간 
		}

		bw.flush();
		bw.close();
	}
}
