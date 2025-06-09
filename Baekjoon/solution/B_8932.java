package solution;

import java.io.*;
import java.util.StringTokenizer;

//7종 경기
public class B_8932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int score = 0;

			int hurdle = Integer.parseInt(st.nextToken());
			int jump = Integer.parseInt(st.nextToken());
			int shot = Integer.parseInt(st.nextToken());
			int run_200 = Integer.parseInt(st.nextToken());
			int javelin = Integer.parseInt(st.nextToken());
			int spear = Integer.parseInt(st.nextToken());
			int run_800 = Integer.parseInt(st.nextToken());

			score += 9.23076 * Math.pow((26.7 - hurdle), 1.835); //math.pow 거듭제곱
			score += 1.84523 * Math.pow((jump - 75), 1.348);
			score += 56.0211 * Math.pow((shot - 1.5), 1.05);
			score += 4.99087 * Math.pow((42.5 - run_200), 1.81);
			score += 0.188807 * Math.pow((javelin - 210), 1.41);
			score += 15.9803 * Math.pow((spear - 3.8), 1.04);
			score += 0.11193 * Math.pow((254 - run_800), 1.88);
			bw.write(score + "\n");
		}
		bw.flush();
		bw.close();
	}
}