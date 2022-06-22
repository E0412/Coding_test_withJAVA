package solution;

import java.io.*;

//단어 공부 
public class B_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26]; //알파벳 개수만큼의 배열 할당
		String s = br.readLine();
		int max = 0; //최대 값
		char ch = '?'; //출력할 문자열 
		
		//입력한 문자 검사
		for(int i = 0; i < s.length(); i++) {
			//배열의 인덱스 값 도출하기
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { //대문자 범위
				arr[s.charAt(i)-'A']++; //인덱스의 값 1추가
			}
			else { //소문자 범위 
					arr[s.charAt(i)-'a']++;
				}
			}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65); //대문자로 출력하기 위해 65를 더한다 
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
