package level_0;

//가장 큰 수 찾기
public class L0_167 {
	public int[] solution(int[] array) {
		int max = array[0];
		int n = 0;

		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				n = i;
			}
		}
		return new int[]{max, n};
	}	
}
