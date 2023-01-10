package solution;

import java.io.*;
import java.util.*;

//단어 뒤집기 2(stack)
/*
 * 태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열 
 * '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
 * 태그를 제외한 문자열 S의 단어를 뒤집어서 출력 -> 스택에 추가 후 출력 
 */
public class B_17413 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void out(Stack<Character> s) throws IOException {
		while(!s.isEmpty()) {
			bw.write(s.pop().toString());
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine(); //문자열 입력
		Stack<Character> stack = new Stack<>(); 

		boolean check = false; //괄호 확인 

		for (int i = 0; i < S.length(); i++) {
			//여는 괄호, 태그 시작  
			if(S.charAt(i) == '<') {
				check = true;

				//태그 전까지의 단어를 뒤집는다 
				out(stack);
				bw.write(S.charAt(i));
			}
			//닫는 괄호인 경우, 태그 끝부분
			else if(S.charAt(i) == '>') {
				check = false;
				bw.write(S.charAt(i)); //그대로 출력 
			}
			//태그 안에 있는 경우 그대로 출력
			else if(check) {
				bw.write(S.charAt(i));
			}
			
			//태그 밖에 있는 경우 
			else {
				//공백일 때 전부 pop 한다 
				if(S.charAt(i) == ' ') {
					out(stack);
					bw.write(S.charAt(i));
				} else {
					stack.push(S.charAt(i));  //스택에 추가 
				}
			}
		}
		out(stack);
		bw.flush();
		bw.close();
	}
}
