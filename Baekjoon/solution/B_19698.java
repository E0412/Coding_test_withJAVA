package solution;

import java.io.*;
import java.util.StringTokenizer;

//헛간 청약
public class B_19698 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); //소들의 수
		int W = Integer.parseInt(st.nextToken()); //헛간의 크기
		int H = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken()); //공간의 크기

		int cow = (W / L) * (H / L);

		if(N <= cow) {
			bw.write(N + "");
		} else {
			bw.write(cow + "");
		}
		bw.flush();
		bw.close();
	}
}