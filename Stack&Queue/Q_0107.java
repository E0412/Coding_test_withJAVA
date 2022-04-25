import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//교육 과정 설계 
public class Q_0107 {
	public String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x : need.toCharArray()) Q.offer(x);
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) {
				if(x!=Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		Q_0107 T = new Q_0107();
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		String k = kb.next();
		System.out.println(T.solution(n, k));
	}

}
