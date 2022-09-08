package solution;

import java.io.*;
import java.util.*;


//후위 표기식 2(Stack)
/**
 * 왼쪽에 있는 숫자와 연산을 한다 
 * (A+(B*C)) - (D/E)
 * 출력은 Double 형으로 
 */
public class B_1935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); //정수 입력
		String input = br.readLine(); //문자열 입력 
		
		double[] dArr = new double[N]; //소수형으로 입력 배열 생성 
		for (int i = 0; i < N; i++) {
			dArr[i] = Double.parseDouble(br.readLine());
		}
		
		Stack<Double> stack = new Stack<Double>();
		
		double result = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if(ch >= 65 && ch <= 90) {
				// dArr[0] == 3번째줄 입력에 해당하는 값 
				stack.push(dArr[ch - 'A']); 
			} else {
				double lt = stack.pop(); //앞쪽에 위치한 값 
				double rt = stack.pop(); //뒤쪽에 위치한 값 
				
				switch (ch) {
				case '+':
					stack.push((rt + lt));	
					continue;
				case '-':
					stack.push((rt - lt));	
					continue;
				case '*':
					stack.push((rt * lt));	
					continue;
				case '/':
					stack.push((rt / lt));
					continue;
				}
			}
		}
		System.out.printf("%.2f", stack.pop()); //소수점 2번째 자리까지 출력
	}
}
