package solution;

import java.io.*;

//정수 제곱근
public class B_2417 {

	private static long binarySearch(long in) {
		long left = 0; 
		long right = in; 
		long ans = 0;

		//이분탐색
		while(left <= right) {
			long mid = (left + right) / 2;
			//mid의 제곱이 in보다 같거나 클 때의 mid값을 ans에 저장
			if(in <= Math.pow(mid, 2)) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long in = Long.parseLong(br.readLine());
		long sum = binarySearch(in);
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}
