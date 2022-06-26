package solution;
import java.util.Arrays;
import java.util.Scanner;

//좋은 수 구하기
public class B_1253 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int count = 0;
		int N = kb.nextInt();
		long arr[] = new long[N];
		for(int i = 0; i<N; i++) {
			arr[i] = kb.nextLong();
		}
		Arrays.sort(arr);
		for(int k = 0; k < N; k++) { //k만큼 반복 
			long find = arr[k]; //찾는 값 
			int i = 0;
			int j = N-1;
			//투 포인터 
			while(i < j) {
				if(arr[i]+arr[j] == find) {//find는 두 수의 합이어야 한다
					if( i != k && j != k) {
						count++;
						break;
					} else if(i == k) {
						i++;
					} else if(j == k) {
						j--;
					}
				} else if(arr[i]+arr[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(count);
	}
}
