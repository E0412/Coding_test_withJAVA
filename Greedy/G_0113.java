import java.io.*;
import java.util.*;

//모험가 길드
/*
 * 공포도에 따라 최대 몇 개의 모험가 그룹을 만들 수 있는지 구하기
 * 모든 모험가를 특정한 그룹에 넣을 필요는 없다 
 */
public class G_0113 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int result = 0; //총 그룹의 수
		int cnt = 0; //현재 그룹에 포함된 모험가의 수
		//공포도를 낮은 것부터 확인 
		for (int i = 0; i < N; i++) {
			cnt += 1;  //현재 그룹에 모험가 포함
			//현재 그룹에 포함된 모험가의 수가 공포도 이상인 경우, 그룹 결성
			if(cnt >= arr[i]) {
				result += 1; //총 그룹의 수 증가
				cnt = 0;
			}
		}
		System.out.println(result);
	}
}
