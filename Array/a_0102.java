import java.util.Scanner;

//보이는 학생 
public class a_0102 {
	public int solution(int n , int[] arr) {
		int answer = 1, max = arr[0];
		for(int i = 0; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		a_0102 T = new a_0102();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}

}
