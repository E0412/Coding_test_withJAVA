import java.io.*;

//곱하기 혹은 더하기 
/*
 * x 혹은 + 연산자를 넣어 만들어질 수 있는 가장 큰 수 구하기  
 * 0 혹은 1인 경우 + 연산이 효율적이다 
 * 두 수 중 하나라도 1 이하인 경우에 더하고, 2이상이면 곱한다 
 */
public class G_0112 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		//첫 번째 문자를 숫자로 변경 후 값을 대입
		long result = s.charAt(0) - '0';
		for (int i = 1; i < s.length(); i++) {
			//두 수 중에 하나라도 '0' 혹은 '1'인 경우 더하기 수행
			int num = s.charAt(i) - '0'; //두 번째 문자
			if(num <= 1 || result <= 1) {
				result += num;
			} else { //그 외는 곱하기 수행 
				result *= num;
			}
		}
		System.out.println(result);
	}
}
