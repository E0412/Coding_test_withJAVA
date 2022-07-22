import java.io.*;
import java.util.*;

//힙 정렬 == 퀵 정렬 
public class S_0212 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken()); //기준 K번째 수 찾기
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		quickSort(arr, 0, N - 1, K - 1); //퀵 정렬 수행
		
		System.out.println(arr[K - 1]);//k번째 데이터 출력 
	}
	//L == start, R == end 
	public static void quickSort(int[] arr, int L, int R, int K) {
		if(L < R) {
			int pivot = partition(arr, L, R);
			//K번째 수가 pivot이면 종료
			if(pivot == K) 	return;
			
			//K가 pivot보다 작으면 왼쪽 그룹만 정렬 수행 
			else if(K < pivot) quickSort(arr, L, pivot - 1, K);
			
			//K가 pivot보다 크면 오른쪽 그룹만 정렬 수행
			else quickSort(arr, pivot + 1, R, K);
		}
	}

	//파티션을 나눈다 
	public static int partition(int[] arr, int L, int R) {
		int M = (L + R)/2;
		swap(arr, L, R); //중앙값을 1번째 요소로 이동하기 
		int pivot = arr[L];
		
		int i = L, j = R;
		while (i < j) {
			while(arr[j] > pivot) {
				j--; //작은수가 나올때까지 --
			}
			while(i < j && arr[i] <= pivot) {
				i++; //큰 수가 나올때까지 ++
			}
			swap(arr, i, j); //찾은 i와 j 교환
			}
		//i == j 피벗의 값을 양쪽으로 분리한 가운데에 오도록 설정 
		arr[L] = arr[i];
		arr[i] = pivot;
		return i;
		}

	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
