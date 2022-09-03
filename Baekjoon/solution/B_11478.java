package solution;

import java.io.*;
import java.util.HashSet;

//서로 다른 부분 문자열의 개수(HashSet)
/**
 * 입력받은 문자열 s의 서로 다른 부분 문자열의 개수를 출력한다
 * ArrayList를 사용시 시간초과가 발생하기 때문에 HashSet 활용
 * substring(i, j) == i부터 j 전까지의 문자열을 return한다 
 */
public class B_11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) { 
				if(!set.contains(s.substring(i, j))) { //set에 s.substring(i, j)의 값이 없을 때 
					set.add(s.substring(i, j)); //s.substring(i, j)를 추가한다 
				}
			}
		}
		bw.write(set.size() + ""); //set에 저장된 개수를 출력한다 
		bw.flush();
		bw.close();
	}
}
