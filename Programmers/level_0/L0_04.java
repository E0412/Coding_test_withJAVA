package level_0;

import java.io.*;
import java.util.StringTokenizer;

//접두사인지 확인하기
public class L0_04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String my_string = st.nextToken(); //banana
		String is_prefix = st.nextToken(); //접두사인지 확인할 객체
		
		int answer = 0;
		
		/*
		 * my_string.contains(is_prefix) 방식은 nan이 포함된 2번째 테스트 케이스에서 통과가 불가능함
		 * 아래의 코드는 is_prefix가 my_string 보다 긴 문자열인 경우 오류 발생
		 * String s = my_string.substring(0, is_prefix.length());
		 */
		
		//startsWith()를 사용하여 해결
		if(my_string.startsWith(is_prefix)) {
			answer = 1;
		}
		
		System.out.println(answer);
	}
}
