package level_0;

//잘라서 배열로 저장하기
public class L0_101 {
	public String[] solution(String my_str, int n) {
		int idx = (int) Math.ceil((double) my_str.length() / n);
		String[] arr = new String[idx];
		for (int i = 0; i < idx; i++) {
			if(n * (i+1) <= my_str.length()) {
				arr[i] = my_str.substring(n * i, n * (i+1));
			} else if(n * (i+1) > my_str.length()) {
				arr[i] = my_str.substring(n * i, my_str.length());
				break;
			}
		}
		return arr;
	}
}
