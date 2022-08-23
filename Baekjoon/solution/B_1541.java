package solution;

import java.util.*;

//최솟값을 만드는 괄호 배치 찾기 
/**
 * 더하기 연산을 실행한 후 
 * 가장 앞에 있는 값에서 
 */
public class B_1541 {
	static int answer = 0;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();
		String[] arr = input.split("-");
		for (int i = 0; i < arr.length; i++) {
			int temp = Sum(arr[i]);
			if(i == 0)
				answer += temp;
			else answer -= temp;
		}
		System.out.println(answer);
	}
	static int Sum(String s) {
		int sum = 0;
		String temp[] = s.split("[+]");
		for (int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}
}
