package solution;

import java.io.*;

//줄임말 만들기
public class B_3181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String arr[] = br.readLine().split(" ");
		String word[] = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"}; //쓸모없는 단어
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(word[i])) {
				//줄임말만 저장해서 출력해야함
			}
		}
		
		bw.flush();
		bw.close();
	}
}
