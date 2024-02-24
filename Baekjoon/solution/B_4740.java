package solution;

import java.io.*;

//거울, 오! 거울
public class B_4740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String in = br.readLine();
			//*** 입력시 프로그램 종료
			if(in.equals("***")) break;
			//글자를 역순으로 바꾸어 출력 
			for (int i = 0; i < in.length(); i++) {
				bw.write(in.charAt((in.length() - 1) - i));
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
