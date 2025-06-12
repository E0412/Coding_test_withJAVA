package solution;

import java.io.*;

//대충 더해
public class B_8949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] A = new int[10000000];
		int[] B = new int[10000000];

		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < B.length; i++) {
			B[i] = Integer.parseInt(br.readLine());
		}

		//자릿수에 맞게 각각 더한값을 합쳐야함

		bw.flush();
		bw.close();
	}
}
