package level_1;

//콜라츠 추측
public class L1_14 {
	public int solution(int num) {
		int answer = 0;
		long n = num; //long으로 변환하지 않을시 오버플로우가 발생하여 값이 제대로 출력되지 않음
		while(n != 1) {
			if(answer == 500) {
				return -1;
			}
			if(n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			}
			answer++;
		}
		return answer;
	}
}
