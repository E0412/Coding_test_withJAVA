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
		
		
		bw.flush();
		bw.close();
	}
}
