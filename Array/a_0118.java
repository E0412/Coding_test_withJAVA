import java.util.Scanner;

//최대 길이 연속부분수열 
public class a_0118 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		for(int rt = 0; rt<n; rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>m) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer=Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		a_0118 T = new a_0118();
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
