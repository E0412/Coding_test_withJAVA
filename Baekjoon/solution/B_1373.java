package solution;

import java.io.*;
import java.util.ArrayList;

//2진수 8진수
public class B_1373 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		//세 자리씩 나누어 떨어지게 한다 
		if(input.length() % 3 == 2) 
			input = "0" + input; //2자리 수인 경우 한자리 추가
		
		if(input.length() % 3 == 1) 
			input = "00" + input; //한자리 수인 경우 2자리 추가
		
		int a, b, c = 0;
		
		for (int i = input.length() - 1; i >= 0; i--) {
			int num = input.charAt(i) - '0';
			if (i % 3 == 2) 
				a = num * 1;
			
			else if (i % 3 == 1) 
				b = num * 2;
			
			else if (i % 3 == 0) {
				c = num * 4;
				
			}
		}
		
		bw.flush();
		bw.close();
	}
}
