package level_1;

//하샤드 수
public class L1_08 {
	public boolean solution(int x) {
		String s = String.valueOf(x);
		int sum = 0;
		//자릿수의 합
		for(int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		//합이 x로 나누어지면 true 아닐시 false
		return x % sum == 0 ? true : false;
	}
}
