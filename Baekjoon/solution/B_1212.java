package solution;

import java.io.*;

//8진수 2진수
public class B_1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String in = br.readLine();
		String[] arr = {"000", "001", "010", "011", "100", "101", "111"};


		for (int i = 0; i < in.length(); i++) {
			int n = in.charAt(i) - '0';
			sb.append(arr[n]);
		}

		bw.flush();
		bw.close();
	}
}
