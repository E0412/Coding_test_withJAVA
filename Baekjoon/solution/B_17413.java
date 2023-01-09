package solution;

import java.io.*;
import java.util.*;

//단어 뒤집기 2(stack)
/*
 * 태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열 
 * '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
 * 태그를 제외한 문자열 S의 단어를 뒤집어서 출력
 */
public class B_17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String S = st.nextToken(); //문자열 입력
		Stack<Character> stack = new Stack<>(); 

		boolean check = false; //괄호 확인 

		for (int i = 0; i < S.length(); i++) {
			//여는 괄호의 경우 
			if(S.charAt(i) == '<') {
				check = true;

				while(!stack.isEmpty()) {
					bw.write(stack.pop()); 
				}
				bw.write(S.charAt(i));
			}
			//닫는 괄호인 경우
			else if(S.charAt(i) == '>') {
				check = false;
				bw.write(S.charAt(i)); //그대로 출력 
			}
			else if(check) {
				bw.write(S.charAt(i));
			}
			//괄호 밖에 있는 경우 
			else if(!check) {
				//공백일 때 전부 pop 한다 
				if(S.charAt(i) == ' ') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(S.charAt(i));
				} else {
					stack.push(S.charAt(i));  //스택에 추가 
				}
			}
		}
		while(!stack.isEmpty()) {
			bw.write(stack.pop());
		}
		bw.flush();
		bw.close();
	}
}
