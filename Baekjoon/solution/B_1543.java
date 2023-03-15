package solution;

import java.io.*;


//문서 검색 
/*
 * 문서와 검색하려는 단어가 주어졌을 때 중복되지 않게 최대 몇 번 등장하는지 출력
 */
public class B_1543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String doc = br.readLine();
		String search = br.readLine();

		//문자열의 길이를 잰다
		int len = doc.length(); //문서의 길이 
		int size = search.length(); //단어의 길이

		//replace 함수를 사용해 중복된 단어를 지운다
		doc = doc.replace(search, "");

		//지운 단어의 길이만큼 나눈다
		int answer = (len - doc.length()) / size;

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
