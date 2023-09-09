package solution;

import java.io.*;
import java.util.*;

//암호
/*
 * 평문의 단어에 암호화 키에 해당하는 숫자를 빼서 암호화한다
 */
public class B_1718 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String sen = br.readLine(); //평문
		String key = br.readLine(); //암호화 키

		List<Character> a = new ArrayList<>(); //평문 저장리스트
		List<Character> b = new ArrayList<>(); //암호화 키 저장리스트 

		//리스트 할당
		for (int i = 0; i < sen.length(); i++) {
			a.add(sen.charAt(i));
		}
		for (int i = 0; i < key.length(); i++) {
			b.add(key.charAt(i));
		}

		char[] code = new char[sen.length()];

		for (int i = 0; i < code.length; i++) {
			code[i] = a.get(i); //평문 저장 
		}

		for (int i = 0; i < a.size(); i++) {
			//평문이 암호화 키보다 긴 경우
			if(a.size() > b.size()) {
				b.add(b.get(i));
			}
			int last = b.get(i) - 97 + 1;

			//평문의 단어에 암호화 키에 해당하는 숫자를 빼서 암호화
			code[i] = (char)(a.get(i) - last);

			//변형된 문자가 'a' 이전의 문자가 되면 맨 뒤로 
			if(code[i] < 97) code[i] += 26;

			//평문의 문자가 공백 문자인 경우 저장
			if(a.get(i) == ' ') code[i] = ' ';
		}

		for(char answer : code) {
			bw.write(answer + "");
		}
		bw.flush();
		bw.close();
	}
}
