package solution;

import java.util.Scanner;
import java.util.Stack;

//스택 오름차순 수열
public class B_1874 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); //출력할 결과 저장
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = kb.nextInt();
		int start = 0;
		
		//N번 반복
		while(N-- > 0) {
			int value = kb.nextInt();
			if(value > start) {
				//입력받은 value까지 push
				for(int i = start+1; i <= value; i++) {
					stack.push(i);
					sb.append("+\n"); //+를 저장
				}
				start = value; //오름차순 유지를 위한 변수 초기화
			}
			//top에 있는 원소가 입력받은 값과 다른경우
			else if(stack.peek() != value) {
				System.out.println("NO");
				return; 
			}
			stack.pop();
			sb.append("-\n");
		}
		System.out.println(sb);
	
	}
}
