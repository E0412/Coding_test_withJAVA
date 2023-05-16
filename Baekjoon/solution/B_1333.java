package solution;

import java.io.*;
import java.util.StringTokenizer;

//부재중 전화
public class B_1333 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken()); //노래의 개수
		int L = Integer.parseInt(st.nextToken()); //모든 노래의 길이
		int D = Integer.parseInt(st.nextToken()); //전화벨이 울리는 간격

		//전화가 오면 +1초 노래와 노래 사이에는 5초의 간격(개수당 5초 추가)

		bw.flush();
		bw.close();
	}
}
