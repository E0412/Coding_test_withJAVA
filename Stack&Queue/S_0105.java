import java.util.Scanner;
import java.util.Stack;

//쇠 막대기, 여는 괄호는 무조건 push
public class S_0105 {
		public int solution(String str) {
			int answer = 0;
			Stack<Character> stack = new Stack<>();
			for(int i = 0; i<str.length(); i++) { //인덱스로 접근
				if(str.charAt(i)=='(') stack.push('(');
				else {
					stack.pop();
					if(str.charAt(i-1) == '(') answer += stack.size(); //레이저 지점
					else answer++;
				}
			}
			return answer;
		}
	
	public static void main(String[] args) {
		S_0105 T = new S_0105();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
