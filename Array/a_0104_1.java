import java.util.Scanner;

//피보나치 수열 배열 사용x
public class a_0104_1 {
	public void solution(int n) {
		int a = 1, b =1, c;
		System.out.println(a+" "+b+" ");
		for(int i = 2; i<n; i++) {
			c = a+b;
			System.out.println(c+" ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		a_0104_1 T = new a_0104_1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.solution(n);
	}

}
