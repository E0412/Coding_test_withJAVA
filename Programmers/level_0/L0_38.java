package level_0;

import java.util.Arrays;

//접미사 배열
public class L0_38 {
	public String[] solution(String my_string) {
		String[] arr = new String[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			String s = my_string.substring(i);
			arr[i] = s;
		}

		Arrays.sort(arr);
		return arr;
	}
}
