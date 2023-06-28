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

		String n = br.readLine(); //현재 시간
		String m = br.readLine(); //임무를 시작한 시간

		String[] c_time = n.split(":"); 
		String[] s_time = m.split(":");
		String[] result = new String[3];

		boolean check = false; //앞의 수 확인

		//남은 시간구하기
		for (int i = 2; i >= 0; i--) {
			int time = Integer.parseInt(c_time[i]);
			int start = Integer.parseInt(s_time[i]);

			if(check) {
				start--;
			}

			if(start < time) {
				if(i == 0) {
					start += 24;
				} else {
					start += 60;
				}
				check = true;
			} 
			else {
				check = false;
			}

			int end = start - time;

			if(end < 10) {
				result[i] = "0" + end; 
			} else {
				result[i] = String.valueOf(end);
			}
		}
		bw.write(result[0] + ":" + result[1] + ":" + result[2]);
		bw.flush();
		bw.close();
	}
}
