package solution;

import java.io.*;
import java.util.Stack;

//안정적인 문자열
/* 빈 문자열은 안정적이다.
 * S가 안정적이라면, {S}도 안정적인 문자열이다.
 * S와 T가 안정적이라면, ST(두 문자열의 연결)도 안정적이다.
 */
public class B_4889 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tNum = 1; //테스트 케이스 번호 

		while(true) {
			String in = br.readLine();
			//종료조건
			if(in.contains("-")) break;
			char arr[] = in.toCharArray(); //문자열 변환
			int min = 0; //최소 연산의 수 
			Stack<Character> s = new Stack<>();

			//안정적인 문자열 구하기
			for (int i = 0; i < arr.length; i++) {
				//'{'인 경우 스택에 추가
				if(arr[i] == '{') {
					s.add(arr[i]); 
				} 
				//'}'인 경우 
				else {
					if(s.isEmpty()) {
						min++;
						s.add('{');
					} else {
						s.pop();
					}
				}
			}
			if(!s.isEmpty()) {
				min += s.size() / 2;
			}
			bw.write(tNum + ". " + min + "\n");
			tNum++;
		}
		bw.flush();
		bw.close();
	}
}
