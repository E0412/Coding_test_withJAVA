package solution;

import java.io.*;
import java.util.*;

//링(최대공약수, 기약분수로 출력)
//기약분수로 나타내는 경우 분모와 분자의 최대 공약수로 나누면 된다 
public class B_3036 {
	
	//최대공약수 메서드
	public static int gcd(int a, int b) {
		int r = 0;
		
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		//첫 번째 링은 따로 입력받는다
		int firstR = Integer.parseInt(st.nextToken());
		
		//첫 번째 링을 제외한 나머지 링
		for (int i = 1; i < N; i++) {
			int otherR = Integer.parseInt(st.nextToken());
			
			//최대공약수(기약분수로 만들기 위해 필요)
			int gcd = gcd(firstR, otherR);
			
			System.out.println((firstR / gcd) + "/" + (otherR / gcd));
		}
	}
}
