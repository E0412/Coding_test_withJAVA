package solution;

//주몽(투 포인터)
import java.util.Arrays;
import java.util.Scanner;

//투 포인터 
public class B_1940 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt(); //재료의 개수
		int M = kb.nextInt(); //갑옷 번호의 합
		int[] arr = new int[N];
		int count = 0;
		for(int k = 0; k<N; k++) {
			arr[k] = kb.nextInt();
		}
		Arrays.sort(arr);
		int i = 0;
		int j = N-1;
		while(i < j) {
			if(arr[i]+arr[j] < M) {
				i++;
			} else if(arr[i]+arr[j] > M) {
				j--;
			} else {
				i++; j--; count++;
			}
		}
		System.out.println(count);
	}
}
