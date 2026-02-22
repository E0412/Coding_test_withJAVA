package level_2;

//최댓값과 최솟값
public class L2_07 {
	public String solution(String s) {
		String[] str = s.split(" ");

		int min = Integer.parseInt(str[0]);
		int max = min;

		for(int i = 1; i < str.length; i++) {
			int n = Integer.parseInt(str[i]);
			min = Math.min(min, n);
			max = Math.max(max, n);
		}
		return min + " " + max;
	}
}
