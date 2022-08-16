package solution;

import java.io.*;
import java.util.*;

//영수증(문자열)
public class B_25304 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int cnt = Integer.parseInt(br.readLine());
		int sum = 0;

		StringTokenizer st;
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int price = a * b;
			sum += price;
		}
		if(sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
