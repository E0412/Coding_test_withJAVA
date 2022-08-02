package solution;

import java.io.*;
import java.util.*;

//약수
/*
어떤수 N의 진짜 약수가 모두 주어질 때
입력으로 들어오는 값 중 최솟값 * 최댓값을 한다
 */
public class B_1037 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine()); //수의 개수
		
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while(input-- > 0) {
			int in = Integer.parseInt(st.nextToken());
			
			max = in > max ? in : max;//if(in > max) max = in;와 동일
			min = in < min ? in : min;
			
		}
		System.out.println(max * min);
	}
}
