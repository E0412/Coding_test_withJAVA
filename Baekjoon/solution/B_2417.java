package solution;

import java.io.*;

//정수 제곱근
public class B_2417 {

	private static long binarySearch(long in) {
		long left = 0; 
		long right = in; 
		long ans = 0;

		while(left <= right) {

		}

		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long in = Long.parseLong(br.readLine());
		long sum = binarySearch(in);
		bw.write(sum + "");
	}
}
