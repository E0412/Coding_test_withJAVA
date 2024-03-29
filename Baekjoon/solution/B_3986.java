package solution;

import java.io.*;
import java.util.*;

//좋은 단어(stack)
/*
 * 좋은 단어란 단어 위로 아치형 곡선을 그어 글자끼리 쌍을 지을 때 
 * 선이 교차하지 않으면서 짝을 지을 수 있는 단어이다
 * 좋은 단어의 개수를 출력한다 
 */
public class B_3986 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0; //좋은 단어의 개수 
		
		for (int i = 0; i < N; i++) {
			String in = br.readLine();
			
			Stack<Character> s = new Stack<>();
			s.push(in.charAt(0));
			
			for (int j = 1; j < in.length(); j++) {
				if(s.size() > 0 && s.peek() == in.charAt(j)) {
					s.pop();
				} else {
					s.push(in.charAt(j));
				}
			}
			if(s.isEmpty()) cnt++;
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
