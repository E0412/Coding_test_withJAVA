package solution;

import java.io.*;
import java.util.Stack;

//오큰수 NGE(i)
public class B_17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N]; //수열의 배열
		int[] anwArr = new int[N]; //정답 배열
		
		String[] sArr = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(0); //최초값을 push로 초기화
		for (int i = 1; i < N; i++) {
			//스택이 할당되어있고, 현재 수열값이 top에 해당하는 수열보다 클 때까지 반복
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				anwArr[stack.pop()] = arr[i]; //정답 배열에 오큰수를 현재 배열로 저장
			}
			stack.push(i); //새로운 데이터 push
		}
		//반복문을 돈 이후 스택이 비어있지 않다면 빌 때까지 반복
		while(!stack.isEmpty()) {
			anwArr[stack.pop()] = -1; //index에 -1할당
		}
		for (int i = 0; i < N; i++) {
			bw.write(anwArr[i] + " "); //출력한다 
		}
		bw.write("/n");
		bw.flush();
	}
}
