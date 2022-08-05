package solution;

import java.io.*;
import java.util.*;

//최대 공약수와 최소 공배수 
public class B_2609 {
	
	public static int GCD(int a, int b) {
		while(b != 0) {
			//나머지를 구한다
			int r = a % b;
			
			//GCD(a, b) = GCD(b, r)이므로 반환
			a = b;
			b = r;
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int d = GCD(N, M);
		
		System.out.println(d);
		System.out.println(N * M / d);
		
	}
	
}
