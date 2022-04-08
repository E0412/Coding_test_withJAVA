import java.util.Scanner;

//소수(에라토스테네스 체) 
public class a_0105 {
	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]== 0) {
				answer++;
				for(int j = i; j<=n; j=j+i) ch[j]=1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		a_0105 T = new a_0105();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}
