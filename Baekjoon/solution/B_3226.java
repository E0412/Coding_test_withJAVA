package solution;

import java.io.*;

//전화 요금
/* 7:00부터 19:00까지 전화 요금은 1분에 10원
 * 19:00부터 7:00까지 전화 요금은 1분에 5원 일 때, 전화요금을 구한다
 */
public class B_3226 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String[] in = br.readLine().split(" "); //공백으로 구분해서 HH:MM DD 입력
			
			String[] HM = in[0].split(":"); //전화를 건 시간
			int DD = Integer.parseInt(in[1]);
			
			int h = Integer.parseInt(HM[0]); //시간(HH)
			int m = Integer.parseInt(HM[1]); //분(MM)
		}
		
		bw.flush();
		bw.close();
	}
}
