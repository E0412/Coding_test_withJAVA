import java.util.Scanner;

//임시 반장 정하기 
public class a_0111 {
	public int solution(int n, int[][] arr) {
		int answer = 0, min = Integer.MIN_VALUE;
		for(int i = 1; i<n; i++) {
			int cnt = 0;
			for(int j = 1; j<n; j++) {
				for(int k =1; k<=5; k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > min) {
				min=cnt;
				answer=i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		a_0111 T = new a_0111();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i = 1; i<n; i++) {
			for(int j = 1; j<n; j++) {
				arr[i][j]= kb.nextInt();
			}
		}
		System.out.println(T.solution(n,  arr));
	}

}
