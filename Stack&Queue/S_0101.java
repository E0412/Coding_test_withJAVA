import java.util.Scanner;
import java.util.Stack;

//올바른 괄호(Stack)
//괄호가 있는 문제는 대부분 스택을 사용 
public class S_0101 {
	public String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : s.toCharArray()) {//문자배열 생성
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop(); //꺼낸다
			}
		}
		if(!stack.isEmpty()) return "NO";
			return answer;
	}

	public static void main(String[] args) {
		S_0101 T = new S_0101();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
