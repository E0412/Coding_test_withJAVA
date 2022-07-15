package solution;

import java.io.*;
import java.util.*;

//분해 합
public class B_2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int result = 0; 
		
		//배열 할당 후 num에 i값을 할당. 자릿수 합 변수인 sum 선언
		for (int i = 0; i < N; i++) {
			int num = i;
			int sum = 0;
			
			//num이 0이 아닐 때 각 자릿수를 더한다 
			while(num != 0) {
				sum += num % 10;
				num /= 10; 
			}
			//i값과 각 자리수 누적합이 같을 경우 (생성자를 찾은 경우) i 반환 
			if(i + sum == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
