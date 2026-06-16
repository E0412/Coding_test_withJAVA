package level_1;

//옹알이 (2) 
public class L1_53 {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] arr = {"aya", "ye", "woo", "ma"};

		for(int i = 0; i < babbling.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				//발음끼리 합쳐서 검증 필요
				if(babbling[i].contains(arr[j])) {
					answer++;
				}
			}
		}
		return answer;
	}
}
