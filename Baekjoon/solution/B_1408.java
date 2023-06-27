package solution;

import java.io.*;

//24
/*
 * 도현이가 임무를 수행하는데 남은 시간을 (XX:XX:XX)에 맞춰 출력한다
 * 임무를 시작한 시간과 현재 시간이 같은 경우는 주어지지 않는다
 */
public class B_1408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String time = br.readLine(); //현재 시간
		String start = br.readLine(); //임무를 시작한 시간

		String[] c_time = time.split(":"); 
		String[] s_time = start.split(":");
		String[] result = new String[3];
		
		//남은 시간구하기
		for (int i = 2; i >= 0; i--) {
			
		}
		
		bw.flush();
		bw.close();
	}
}
