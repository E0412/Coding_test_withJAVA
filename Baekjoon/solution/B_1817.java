package solution;

import java.io.*;
import java.util.StringTokenizer;

//짐 챙기는 숌
public class B_1817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken()); //책의 개수
		int M = Integer.parseInt(st.nextToken()); //최대 무게
		
		//책의 개수가 0인경우
		if(N == 0) {
			bw.write(0 + "");
			return;
		}
		
		bw.flush();
		bw.close();
	}
}
