package solution;

import java.io.*;

//비밀번호 발음하기
public class B_4659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String in = "";

		while(!(in = br.readLine()).equals("end")) {
			boolean g_chk = false; //모음이 3개 이상인 경우 false
			boolean c_chk = true; //자음이 3개 이상인 경우 false
			boolean eo_chk = true; //그 외 조건
			int g_cnt = 0; //모음 연속 글자 확인, 3 이상일시 g_chk = false
			int c_cnt = 0; //자음 연속 글자 확인

			for (int i = 0; i < in.length(); i++) {
				char now = in.charAt(i);

				//높은 품질의 비밀번호 조건 1
				if(now == 'a' || now == 'e' || now == 'i' || now == 'o' || now == 'u') {
					g_chk = true;
					g_cnt++;
					c_cnt = 0;
					if(g_cnt >= 3) {
						c_chk = false; break;
					}
				} 
				//자음이 3개 연속으로 오는 경우
				else {
					c_cnt++;
					g_cnt = 0;
					if(c_cnt >= 3) {
						c_chk = false; break;
					}
				}
				//같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용
				//-> 이 둘을 제외한 글자들이 연속된 경우 eo_chk = false
				if(i >= 1) {
					if(in.charAt(i) != 'e' && in.charAt(i) != 'o') {
						if(in.charAt(i) == in.charAt(i - 1)) 
							eo_chk = false; 
					}
				}
			}
			if(c_chk && g_chk && eo_chk) {
				bw.write("<" + in + "> is acceptable.\n");
			}
			else {
				bw.write("<" + in + "> is not acceptable.\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
