package solution;

import java.io.*;

//최솟값을 만드는 괄호 배치 찾기 
/**
 * 가능한 큰 수를 뺀다 
 * 더하기 연산을 실행한 후 가장 앞에 있는 값에서 결과값을 뺀다 
 */
public class B_1541 {
	static int answer = 0; //정답 변수 선언 
	//현재 String에 있는 수를 모두 더한다 
	static int addAll(String s) {
		int sum = 0;
		String str[] = s.split("[+]"); //split()이 +를 잘 인식하지 못하여 괄호로 묶어준다
		for (int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]); //형변환하여 리턴값에 더한다 
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] arr = input.split("-");
		for (int i = 0; i < arr.length; i++) {
			int temp = addAll(arr[i]);
			//가장 앞에 있는 값만 더한다
			if(i == 0) answer += temp;
			//더한 값들을 뺀다 
			else answer -= temp;
		}
		System.out.println(answer);
	}
}
