import java.util.Scanner;

//피보나치 수열 
public class a_0104 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i = 0; i<n; i++) {
			answer[i] = answer[i-2]+answer[i-1];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		a_0104 T = new a_0104();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : T.solution(n)) System.out.println(x+" ");
	}

}
