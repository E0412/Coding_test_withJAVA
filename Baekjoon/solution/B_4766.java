package solution;

import java.io.*;

//일반 화학 실험
public class B_4766 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double N = Double.parseDouble(br.readLine());

		while(true) {
			double M = Double.parseDouble(br.readLine());

			if(M == 999) break; //종료조건

			//각 온도와 이전 온도와의 차이 출력
			String answer = String.format("%.2f", (M - N)); //소수점 둘째자리까지 출력
			bw.write(answer + "\n");
			N = M; //현재값을 저장 -> 다시 연산
		}
		bw.flush();
		bw.close();
	}
}
