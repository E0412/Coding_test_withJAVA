import java.util.*;

//크레인 인형뽑기(Stack)
/**
 * 인형을 발견하면 stack에 할당한다 
 * board[][] 2차원 배열을 선언한다 
 *
 */
public class S_0111 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int pos : moves) {
			//2차원 배열의 행 크기 
			for(int i = 0; i < board.length; i++) {
				//행이 내려가면서 인형을 발견한다 
				if(board[i][pos-1] != 0) {
					int tmp = board[i][pos-1]; //인형 번호를 tmp에 할당
					board[i][pos-1] = 0;
					
					//스택의 상단에 있는 인형과 동일한지 확인 
					if(!stack.isEmpty() && tmp == stack.peek()) {
						answer += 2;
						stack.pop(); //상단에 존재하는 것을 내보낸다 
					}
					else stack.push(tmp);
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		S_0111 T = new S_0111();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int[][] board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = kb.nextInt(); 
			}
		}
	}
}
