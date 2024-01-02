package solution;

import java.io.*;

//트ㅏㅊ;
/*
 * 입력된 글자의 한 칸 앞 글자를 출력하면 된다
 */
public class B_4378 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		String in = "";

		//반복문 돌면서 이전 문자로 저장
		while((in = br.readLine()) != null) {
			for(char ch : in.toCharArray()) {
				if(ch == ' ') bw.write(" "); //공백 그대로 출력
				//이전 문자 출력
				else {
					char fix = keyboard.charAt(keyboard.indexOf(ch) - 1);
					bw.write(fix);
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}