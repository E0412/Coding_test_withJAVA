package solution;

import java.io.*;
import java.util.StringTokenizer;

//문서 검색 
/*
 * 문서와 검색하려는 단어가 주어졌을 때 중복되지 않게 최대 몇 번 등장하는지 출력
 */
public class B_1543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	
		
		String doc = br.readLine();
		String search = br.readLine();
		
		bw.flush();
		bw.close();
	}
}
