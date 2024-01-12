package solution;

import java.io.*;
import java.util.StringTokenizer;

//수학은 비대면강의입니다
public class B_19532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		for (int x = -999; x <= 999; x++) {
			for (int y = -999; y <= 999; y++) {
				//연립방정식 사용
				if(a * x + b * y == c) {
					if(d * x + e * y == f) {
						bw.write(x + " " + y + "\n");
						break;
					}
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
