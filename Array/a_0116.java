import java.util.Scanner;

//연속 부분 수열(복합적 문제) 
public class a_0116 {
		public int solution(int n, int m, int[] arr) {
			int answer = 0, sum = 0, lt = 0;
			for(int rt=0; rt<n; rt++) {
				sum += arr[rt];
				if(sum == m) answer++;
				while(sum > m) {
					sum -= arr[lt++];
					if(sum == m) answer++;
				}
			}
			
			return answer;
		}
		
	public static void main(String[] args) {
		a_0116 T = new a_0116();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}

}
