package solution;

import java.io.*;

//칸토어 집합
public class B_4779 {

	static StringBuilder sb;

	static void set(int start, int length) {
		//길이가 1이면 멈춘다 
		if(length == 1) return;

		int size = length / 3;
		//3등분 뒤 가운데 문자열을 공백으로 바꾼다
		for (int i = start + size; i < start + 2 * size; i++) {
			sb.setCharAt(i, ' ');
		}
		set(start, size); //3등분 문자열의 첫번째 
		set(start + 2 * size, size); //세번째
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = "";

		while((s = br.readLine()) != null) {
			sb = new StringBuilder();

			int N = Integer.parseInt(s);
			int m = (int) Math.pow(3, N);

			//'-'가 3^N개 있는 문자열
			for (int i = 0; i < m; i++) {
				sb.append("-");
			}
			//칸토어 집합의 근사구하기
			set(0, m);
			bw.write(sb + "\n");
		}
		bw.flush();
		bw.close();
	}
}
