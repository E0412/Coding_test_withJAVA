import java.util.Arrays;
import java.util.Scanner;

//마구간 정하기(결정 알고리즘) 
public class S_0210 {
	public int count(int[] arr, int dist) { //함수를 만드는 것이 중요 
		int cnt = 1;
		int ep = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]-ep>=dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) { //좌표 정렬 
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		while(lt<=rt) {
			int mid = (lt + rt)/2;
			if(count(arr, mid)>=m) {
				answer = mid;
				lt = mid+1;
			}
			else rt = mid -1;
		}
		return answer;
	}

	public static void main(String[] args) {
		S_0210 T = new S_0210();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}

}
