package solution;

import java.io.*;
import java.util.*;

//접미사 배열
public class B_11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine(); //입력
		String sArr[] = new String[s.length()]; //입력 길이만큼의 배열 생성
		
		//substring으로 문자를 잘라서 배열에 저장한다
		for (int i = 0; i < s.length(); i++) {
			sArr[i] = s.substring(i, sArr.length);
		}
		
		Arrays.sort(sArr); //정렬하여 사전순서대로 저장 
		
		//배열이기 때문에 forEach문을 사용하여 간략화
		for(String answer : sArr) {
			sb.append(answer).append('\n');
		}
		System.out.println(sb);
	}
}
