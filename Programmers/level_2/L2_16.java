package level_2;

//카펫
public class L2_16 {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		//약수는 √n 기준으로 대칭 -> Math.sqrt() 
		for (int i = 1; i <= Math.sqrt(yellow); i++) {
			//내부 카펫 yellow의 약수를 구한다
			if(yellow % i == 0) {
				int n = i;
				int m = yellow / i; //약수의 쌍

				//(약수의 쌍 + 2)의 곱이 전체 크기인 경우 값 저장 
				if((brown + yellow) == (n + 2) * (m + 2)) {
					answer[0] = Math.max(n, m) + 2; //가로 >= 세로
					answer[1] = Math.min(n, m) + 2;
				}
			}
		}
		return answer;
	}
}
