package level_0;

import java.util.Scanner;

//조건 문자열 
public class L0_13 {
	//조건문 수행 
	static int solution(String ineq, String eq, int n, int m) {

		if (ineq.equals("<") && eq.equals("=")) {
			return n <= m ? 1 : 0;		
		} else if (ineq.equals(">") && eq.equals("!")) {
			return n > m ? 1 : 0;
		} else if (ineq.equals(">") && eq.equals("=")) {
			return n >= m ? 1 : 0;
		} else {
			return n < m ? 1 : 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		int c = sc.nextInt();
		int d = sc.nextInt();

		int answer = solution(a, b, c, d);
		
		System.out.println(answer);
	}

}
