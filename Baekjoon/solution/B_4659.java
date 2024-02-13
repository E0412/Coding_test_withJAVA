package solution;

import java.io.*;

//비밀번호 발음하기
public class B_4659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String pw = "";
		boolean check; //글자가 모음인 경우 true
		int cnt = 0; //자음 연속 글자 확인, 3 이상일시 check = false
		int con = 0; //모음 연속 글자 확인


		while(true) {
			String in = br.readLine();

			if(in.equals("end")) break;
			check = false;

			for (int i = 1; i <= 20; i++) {
				//높은 품질의 비밀번호 조건 1
				if(in.charAt(i) == 'a' || in.charAt(i) == 'e' || in.charAt(i) == 'i'
						|| in.charAt(i) == 'o' || in.charAt(i) == 'u') {
					check = true;
					cnt++;
					if(cnt >= 3) check = false; break;
				} 
				//자음이 3개 연속으로 오는 경우
				else {
					con++;
					if(cnt >= 3) check = false; break;
				}
				//같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용
			}
		}

		bw.flush();
		bw.close();
	}
}
