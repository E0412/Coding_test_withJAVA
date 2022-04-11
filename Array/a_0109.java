import java.util.Scanner;

//격자판 최대 합
public class a_0109 {
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		for(int i = 0; i<n; i++) {
			sum1= sum2 = 0; //sum1 1행 sum2 1열 
			for(int j = 0; j<n; j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		//두 대각선의 합
		sum1 = sum2 = 0;
		for(int i = 0; i<n; i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		return answer;
	}

	public static void main(String[] args) {
		a_0109 T = new a_0109(); 
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}

}
