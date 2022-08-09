package solution;

import java.io.*;
import java.util.*;

//최소 공배수 
public class B_1934 {
 
	public static int GCD(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int input = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < input; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int d = GCD(a, b);
			System.out.println(a * b / d);
		}
	}
}
