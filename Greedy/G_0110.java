import java.util.Scanner;

//문자열 뒤집기 
public class G_0110 {
	
	public static String s;
	public static int cnt0 = 0; //전부 0으로 바꾸는 경우
	public static int cnt1 = 0; //전부 1로 바꾸는 경우
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		s = kb.next();
		
		//첫번째 원소에서 처리
		if(s.charAt(0) == '1') {
			cnt0 += 1;
		} else {
			cnt1 += 1;
		}
		//두 번째 원소부터 모든 원소 확인
		for (int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) != s.charAt(i + 1)) {
				//다음 수에서 1로 바뀌는 경우
				if(s.charAt(i + 1) == '1')
				cnt0 += 1;
				//0으로 바뀌는 경우
				else cnt1 += 1;
			}
		}
		
		
		System.out.println(Math.min(cnt0, cnt1));//작은 값 출력 
	}
}
