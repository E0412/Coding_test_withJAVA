package solution;

import java.io.*;
import java.util.*;

//최대 공약수 구하기 
public class B_1850 {
	//최대 공약수 메서드 
	public static long gcd(long a, long b) {
		long r = 0;
		while(b != 0) {
			r = a % b; //a * b로 잘못 입력하여 오류가 있었다
			a = b;
			b = r;
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long N = Long.parseLong(st.nextToken()); //N의 길이 
		long M = Long.parseLong(st.nextToken()); //M의 길이 
		
		long answer = gcd(N, M);
		//최대공약수의 길이만큼 1을 반복하여 출력한다 
		while(answer > 0) {
			bw.write("1");
			answer--;
		}
		bw.flush();
		bw.close();
	}
}
