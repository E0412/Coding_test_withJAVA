package solution;

import java.io.*;
import java.util.StringTokenizer;

//이진수 덧셈 
public class B_1252 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int answer = N + M;
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
