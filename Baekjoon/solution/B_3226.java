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
		int total = 0; //총 전화요금
		
		for (int i = 0; i < N; i++) {
			String[] in = br.readLine().split(" "); //공백으로 구분해서 HH:MM DD 입력
			
			String[] HM = in[0].split(":"); //전화를 건 시간
			int DD = Integer.parseInt(in[1]); //통화 시간
			
			int h = Integer.parseInt(HM[0]); //시간(HH)
			int m = Integer.parseInt(HM[1]); //분(MM)
			
			//전화 요금이 5원 > 10원이 되는 경우
			if(m + DD >= 60 && h == 6) {
				total += (60 - m) * 5; //전화요금 1분에 5원
				total += (m + DD - 60) * 10; //해당 시간이 넘어간 경우 1분에 10원
			} 
			//전화 요금이 10원 > 5원이 되는 경우
			else if(m + DD >= 60 && h == 18) {
				total += (60 - m) * 10; 
				total += (m + DD - 60) * 5;  
			}
			//전화요금이 10원인 경우
			else if(h >= 7 && h < 19) total += DD * 10;
			//전화요금이 5원인 경우
			else total += DD * 5;
		}
		bw.write(total + "");
		bw.flush();
		bw.close();
	}
}
