import java.util.Arrays;
import java.util.Scanner;

//중복 확인 
public class S_0205 {
		public String solution(int n, int[] arr) {
			String answer = "U";
			Arrays.sort(arr);
			for(int i = 0; i<n-1; i++) {
				if(arr[i]==arr[i+1]) return "D";
			}
			return answer;
		}
		
	public static void main(String[] args) {
		S_0205 T = new S_0205();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];	
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}
}
