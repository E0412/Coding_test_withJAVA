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
		String result = "";
		Stack<String> s = new Stack<>(); 
		
		bw.flush();
		bw.close();
	}
}
