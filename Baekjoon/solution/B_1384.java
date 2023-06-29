package solution;

import java.io.*;

//메시지
/*  나쁜 말이 여러 개라면, 입력받은 순서대로 출력
 *  아무도 나쁜 말을 하지 않았다면 "Nobody was nasty"를 출력
 */
public class B_1384 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		boolean check = true;
		
		if(check) {
			bw.write("");
			bw.flush();
		}
		else {
			bw.write("Nobody was nasty");
			bw.flush();
		}
		
		bw.close();
	}
}
