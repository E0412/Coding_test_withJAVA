package solution;

import java.io.*;

//대충 더해
public class B_8949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		char[] A = new char[10000000];
		char[] B = new char[10000000];

		//입력방식 수정필요
		for (int i = 0; i < A.length; i++) {
			A[i] = br.readLine().charAt(0);
		}

		for (int i = 0; i < B.length; i++) {
			B[i] = br.readLine().charAt(0);
		}

		int a = A.length; int b = B.length;
		
		if(a > b) {
			for (int i = a; i >= 0; i--) {
//				sb.append(A[i] + B[i]);
				System.out.println(A[i]+ B[i] );
			}
		} else if(b > a) {
			for (int i = b; i >= 0; i--) {
//				sb.append(A[i] + B[i]);
		}
		} else {
			for (int i = a; i >= 0; i--) {
//				sb.append(A[i] + B[i]);
				System.out.println(A[i]+ B[i] );
			}
		}
//		bw.write(sb.reverse().toString());
		bw.flush();
		bw.close();
	}
}
