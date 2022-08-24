package solution;

import java.io.*;
import java.util.*;

//랜선 자르기(이진 탐색)
/**
 * UpperBound 활용 
 * 랜선의 개수를 비교한다 
 *
 */
public class B_1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int k = Integer.parseInt(st.nextToken()); //랜선의 개수
		int N = Integer.parseInt(st.nextToken()); //필요한 랜선의 개수 
		int[] arr = new int[k];
		
		long max = 0; //최댓값
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			//최댓값을 구하는 조건문
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		max++; //max값에 1을 더해야한다 
		long min = 0; //최솟값
		long mid = 0; //중간값
		
		//upper bound 방식으로 탐색 
		while(min < max) {
			mid = (max + min) / 2;
			
			long cnt = 0;
			//구해진 중간 길이로 잘라서 총 몇 개가 만들어지는지 구한다 
			for (int i = 0; i < arr.length; i++) {
				cnt += (arr[i] / mid);
			}
			if(cnt < N) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		//UpperBound로 얻은 값(min)의 -1이 최대 길이가 된다 
		System.out.println(min - 1);
	}
}
