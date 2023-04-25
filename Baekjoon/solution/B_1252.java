package solution;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

//이진수 덧셈 
public class B_1252 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String n = st.nextToken();
		String m = st.nextToken();

		//BigInteger로 형변환 하여 10진수로 만든다
		BigInteger N = new BigInteger(n, 2); //n을 변환한다 
		BigInteger M = new BigInteger(m, 2);  

		//add를 이용하여 N과 M을 합한다
		BigInteger sum = N.add(M); 

		//2진수로 변환한다
		String answer = sum.toString(2);

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
