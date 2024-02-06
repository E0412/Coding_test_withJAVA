package solution;

import java.io.*;
import java.util.StringTokenizer;

//No Brainer
public class B_4562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			if(x >= y) {
				bw.write("MMM BRAINS\n");
			} else {
				bw.write("NO BRAINS\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
