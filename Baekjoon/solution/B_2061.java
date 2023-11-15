package solution;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

//좋은 암호
/* 매우 큰 두 개의 소수를 선택하고, 두 소수를 곱한 값을 암호화에서의 키로 사용한다 
 * -> BigInteger 사용
 *  인수분해 했을 때 나온 수들이 모두 L 이상일 때 좋은 암호가 된다
 */
public class B_2061 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		BigInteger K = new BigInteger(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		boolean[] check = new boolean[L + 1]; //좋은 암호인지 확인
		check[1] = true; 

		for (int i = 2; i < L; i++) { //2 ≤ L ≤ 1,000,000
			if(check[i]) continue; //소수가 아닌경우 continue
			//좋은 암호인 경우 GOOD, 아닌경우 BAD 출력
		}

		bw.flush();
		bw.close();
	}
}
