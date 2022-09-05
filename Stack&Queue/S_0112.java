import java.io.*;
import java.util.*;

//오큰수 구하기(stack)
/**
 * 오큰수 : NGE(i)
 * 오른쪽에 있으면서 A[i]보다 큰 수 중 가장 왼쪽에 있는 수를 의미한다
 * 없는 경우 오큰수는 -1이다 
 *
 */
public class S_0112 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine()); //수열의 크기
		int[] arr = new int[N]; //수열 배열 
		int[] answer = new int[N]; //정답 배열 
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		Stack<Integer> stack = new Stack<Integer>(); //LIFO
		stack.push(0); //최초 값을 push하여 초기화한다 
		
		for (int i = 1; i < N; i++) {
			//스택이 비어있지 않고 && 현재 수열이 스택 top 인텍스가 가리키는 값보다 큰 경우
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				//오큰수를 현재 수열로 저장한다 
				answer[stack.pop()] = arr[i]; 
			}
			stack.push(i); //신규 데이터를 내보낸다(push)
		}
		
		//반복 후 스택이 비어있지 않은경우
		while(!stack.isEmpty()) {
			answer[stack.pop()] = -1; //스택에 쌓은 index에 -1 할당 
		}
		for (int i = 0; i < N; i++) {
			bw.write(answer[i] + " ");
		}
		bw.flush();
		bw.close();
	}
}
