package level_0;

//가까운 1 찾기
public class L0_43 {
	public int solution(int[] arr, int idx) {
		for (int i = 0; i < arr.length; i++) {
			if(i >= idx && arr[i] == 1) {
				return i;
			} 
		}
		return -1;
	}
}
