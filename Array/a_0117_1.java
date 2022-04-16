import java.util.Scanner;

//연속된 자연수의 합 (수학적 방법 사용)
public class a_0117_1 {
	public int solution(int n) {
		int answer = 0, cnt = 1;
		n--;
		while(n>0) {
			cnt++;
			n = n-cnt;
			if(n%cnt==0) 
//				System.out.println(n + " " + cnt); 
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		a_0117_1 T = new a_0117_1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}
