package solution;

import java.io.*;

//비밀번호 발음하기
public class B_4659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String pw = "";
		boolean check; //글자가 모음인 경우 true
		int cnt = 0; //연속 글자 확인, 3 이상일시 check = false
		
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
				}
				//높은 품질의 비밀번호인지 체크
			}
		}
		
		bw.flush();
		bw.close();
	}
}
