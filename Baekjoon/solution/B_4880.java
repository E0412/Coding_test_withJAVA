package solution;

import java.io.*;
import java.util.StringTokenizer;

//다음수
public class B_4880 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			int a1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int a3 = Integer.parseInt(st.nextToken());

			if(a1 == 0 && a2 == 0 && a3 == 0) break;

			if(a2 - a1 == a3 - a2) {
				bw.write("AP " + (a3 + a2 - a1) + "\n");
			} else {
				bw.write("GP " + (a3 * (a2 / a1)) + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
