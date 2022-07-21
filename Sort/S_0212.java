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
		quickSort(arr, 0, arr.length -1);
		
		System.out.println(arr[K - 1]);
	}
	//L == start, R == end 
	public static void quickSort(int[] arr, int L, int R) {
		//파티션을 나누고 오른쪽 첫번째 값을 받아온다
		int pivot = partition(arr, L, R);
		
		//왼쪽 그룹의 요소가 하나 이상일 때 
		if(L < pivot -1) quickSort(arr, L, pivot - 1); 
		
		//오른쪽 그룹의 요소가 하나 이상일 때 
		if(R > pivot) quickSort(arr, pivot, R);
	}

	//파티션을 나눈다 
	public static int partition(int[] arr, int L, int R) {
		int part = arr[(L + R)/2];
		while (L <= R) {
			while(arr[L] < part) L++;
			while(arr[R] > part) R--;
			if(L == R) {
				swap(arr, L, R);
				L++;
				R--;
			}
		}
		return L;
	}
	
	public static void swap(int[] arr, int L, int R) {
		int tmp = arr[L];
		arr[L] = arr[R];
		arr[R] = tmp;
	}
}
