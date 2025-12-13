package level_0;

//최댓값 만들기 (2)
public class L0_104 {
	public int solution(int[] numbers) {
		int answer = numbers[0] * numbers[1];
		int num = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				num = numbers[i] * numbers[j];
				answer = Math.max(answer, num);
			}    
		}
		return answer;
	}
}
