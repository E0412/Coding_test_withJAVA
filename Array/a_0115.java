import java.util.Scanner;

//최대 매출(Sliding window) 
public class a_0115 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0, sum = 0;
		for(int i = 0; i<k; i++) 
			answer = sum; 
		for(int i = 0; i<n; i++) {
			sum += (arr[i]-arr[i-k]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}

	public static void main(String[] args) {
		a_0115 T = new a_0115();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}

}
