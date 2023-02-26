package solution;

import java.io.*;
import java.util.*;

//R2
/* 
 * 두 수의 평균 S는 (R1+R2)/2와 같다 
 */
public class B_3046 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int R1 = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());

		int R2 = 0;
		R2 = S * 2 - R1;

		bw.write(R2 + "");
		bw.flush();
		bw.close();
	}
}
