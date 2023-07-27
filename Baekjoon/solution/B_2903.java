package solution;

import java.io.*;

//중앙 이동 알고리즘
public class B_2903 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int point = 2;
		for (int i = 0; i < N; i++) {
			point = (point - 1) + point; //점의 개수
		}
		bw.write(point * point + ""); //한 변의 점 개수²
		bw.flush();
		bw.close();
	}
}
