package solution;

import java.util.*;
import java.io.*;

//숫자카드 2(이진 탐색)
//중복 원소의 왼쪽 끝 값과 오른쪽 끝 값을 각각 알아낸다 
public class B_10816 {
	//upper bound
	public static int upper(int[] arr, int key) {
		int start = 0;
		int end = arr.length;
		
		while(start < end) {
			int mid = (start + end) / 2;
			
			if(key < arr[mid]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
	//lower bound
	public static int lower(int[] arr, int key) {
		int start = 0;
		int end = arr.length;
		
		while(start < end) {
			int mid = (start + end) / 2;
			
			if(key <= arr[mid]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			//중복 원소에 대한 길이 = (상한 - 하한)
			bw.write(upper(arr, key) - lower(arr, key) + " ");
		}
		bw.flush();
		bw.close();
	}
}
