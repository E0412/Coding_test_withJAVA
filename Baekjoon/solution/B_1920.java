package solution;

import java.io.*;
import java.util.*;

//수 찾기(이진 탐색)
public class B_1920 {
	
	public static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		//배열은 정렬되어야 한다 
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			//찾는 값이 있느면 1, 없으면 0 출력 
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				bw.write(1 + "\n");
			} else {
				bw.write(0 + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
	
	public static int binarySearch(int key) {
		int left = 0; //탐색범위의 왼쪽 끝
		int right = arr.length - 1; //탐색 범위의 오른쪽 끝
		
		while(left <= right) {
			
			int mid = (left + right) / 2; //중간 위치 

			if(key < arr[mid]) {
				right = mid - 1;
			} 
			else if(key > arr[mid]) {
				left = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1; //찾는 값이 없는 경우
	}
}
