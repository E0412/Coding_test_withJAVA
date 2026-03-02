package level_1;

//약수의 개수와 덧셈
public class L1_28 {
	public int solution(int left, int right) {
		int answer = 0;
		int l = 0; //left의 약수 개수
		int r = 0;
		for(int i = 1; i <= left; i++) {
			if(left % i == 0) {
				l++;
			}
		}
		for(int i = 1; i <= right; i++) {
			if(right % i == 0) {
				r++;
			}
		}
		if(l % 2 == 0 && r % 2 == 0) {
			answer += left;
			answer += right;
			System.out.println(answer);
		} else if(l % 2 != 0 && r % 2 == 0) {
			answer -= left;
			answer += right;
		} else if(l % 2 != 0 && r % 2 != 0) {
			answer -= left;
			answer -= right;
		} else if(l % 2 == 0 && r % 2 != 0) {
			answer += left;
			answer -= right;
		}
		return answer;
	}
}
