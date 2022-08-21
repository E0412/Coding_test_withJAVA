import java.io.*;
import java.util.*;

//떡볶이 떡 만들기(이진탐색)
/* 적절한 높이를 찾을 때까지 높이를 조정한다 
 * 최대한 덜 자른 경우의 결과값을 저장하면서 출력해야한다 
 */
public class S_0214 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); //떡의 개수 
		int M = Integer.parseInt(st.nextToken()); //요청한 떡의 길이 
		
		long arr[] = new long[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		//이진 탐색을 위한 시작점과 끝점 설정
		int start = 0;
		int end = 10000; //1e9(10억으로 설정해도 무방)
		
		//이진 탐색 수행
		int result = 0;
		while(start <= end) {
			long total = 0;
			int mid = (start + end) / 2;
			
			//잘랐을 때의 떡의 양
			for (int i = 0; i < N; i++) {
				if(arr[i] > mid) 
					total += arr[i] - mid; 
			}
			//양이 부족하여 더 많이 자른경우(왼쪽 탐색)
			if(total < M) {
				end = mid - 1;
			} 
			//떡의 양이 충분한 경우 덜 자르기(오른쪽 탐색)
			else {
				result = mid; //덜 잘랐을때가 정답 
				start = mid + 1;
			}
		}
		System.out.println(result);
	}
}
