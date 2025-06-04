package solution;


import java.io.*;
import java.util.StringTokenizer;

//7종 경기
public class B_8932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}


		bw.flush();
		bw.close();
	}
}