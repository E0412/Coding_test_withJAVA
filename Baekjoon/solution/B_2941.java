package solution;

import java.io.*;

//크로아티아 알바벳
public class B_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int len = s.length(); //문자열의 길이
		int count = 0;

		for(int i = 0; i < len; i++) {
			char ch = s.charAt(i);

			//ch가 c일때 조건문 실행 
			//예외 방지를 위해 현재 i의 값이 문자열 길이보다 작을 경우에만 조건문 실행 
			if(s.charAt(i) == 'c' && i < len - 1) {
				//ch 다음문자가 '='이거나 '-'인 경우
				if(s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
					i++; // i+1까지가 하나의 문자, 다음 문자를 건너뛰기 위해 1 증가 
				}
			}
			
			else if(s.charAt(i) == 'd' && i < len - 1) {
				if(s.charAt(i + 1) == '-') {
					i++;
				} else if (s.charAt(i + 1) == 'z' && i < len - 2) {
					if(s.charAt(i + 2) == '=') {
						i += 2;
					}
				}
			}
			
			else if(s.charAt(i) == 'l' && i < len - 1) {
				if(s.charAt(i + 1) == 'j') {
					i++;
				}
			}
			
			else if(s.charAt(i) == 'n' && i < len - 1) {
				if(s.charAt(i + 1) == 'j') {
					i++;
				}
			}
			
			else if(s.charAt(i) == 's' && i < len - 1) {
				if(s.charAt(i + 1) == '=') {
					i++;
				}
			}
			
			else if(s.charAt(i) == 'z' && i < len - 1) {
				if(s.charAt(i + 1) == '=') {
					i++;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}
