package level_0;

//원소들의 곱과 합
public class L0_17 {
	public int solution(int[] num_list) {

		int sum = 0;
		int multiply = 1;
		int pow = 1;

		for (int i = 0; i < num_list.length; i++) {
			multiply *= num_list[i]; //모든 원소들의 곱
			sum += num_list[i]; //모든 원소들의 합
			pow = (int) Math.pow(sum, 2); //합의 제곱
		}

		//모든 원소들의 곱이, 원소 합의 제곱보다 작으면 1 크면 0 반환
		return multiply < pow ? 1 : 0;
	}
}
