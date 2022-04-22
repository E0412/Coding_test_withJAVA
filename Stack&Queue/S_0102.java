import java.util.Scanner;
import java.util.Stack;

public class S_0102 {
	public String solution(String s) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : s.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');  //꺼낸것을 return
			} 
				else stack.push(x);
		}
		for(int i = 0; i<stack.size(); i++) answer+=stack.get(i);

		return answer;
	}
	public static void main(String[] args) {
		S_0102 T = new S_0102();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
