package solution;

import java.io.*;
import java.util.*;

//블랙잭(브루트포스)
//일일이 탐색하는 방식 -> 3중 반복문 사용 
public class B_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); //배열 할당 개수
		int M = Integer.parseInt(st.nextToken()); //값 
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr, N, M);
		System.out.println(result);
	}
	
	//탐색 
	static int search(int[] arr, int N, int M) {
		int result = 0;
		
		//3개를 고르기 때문에 첫번째 카드는 N-2까지 순회
		for (int i = 0; i < N-2; i++) {
			for (int j = i + 1; j < N-1; j++) { //첫번째 다음부터 N-1까지 
				for (int k = j + 1; k < N; k++) { //두번째 다음부터 N까지
					
				//카드의 합 변수 val
				 int val = arr[i] + arr[j] + arr[k];
				 //M과 세 카드의 합이 같다면 return
				 if(val == M) {
					 return val;
				 }
				 //세 카드의 합이 이전 합보다 크면서 M보다 작을 때 result
				 if(result < val && val < M) {
					 result = val;
				 }
			   }
			}
		}
		return result; //순회를 마치면 result 리턴 
	}
}