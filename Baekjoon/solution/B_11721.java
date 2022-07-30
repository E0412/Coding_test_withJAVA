package solution;

import java.io.*;

//열 개씩 끊어서 출력
public class B_11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			char answer = s.charAt(i); //단어를 하나씩 출력
			System.out.print(answer);
			//9번째 인덱스 == 10번째단어 일 때 줄바꿈
			if(i % 10 == 9) { 
				System.out.println();
			}
		}
	}
}
