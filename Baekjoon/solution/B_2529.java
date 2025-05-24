package solution;

import java.io.*;
import java.util.StringTokenizer;

//부등호
public class B_2529 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int K = Integer.parseInt(br.readLine());
		char arr[] = new char[K];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			arr[i] = st.nextToken().charAt(0);
		}


		bw.flush();
		bw.close();
	}	
}
