package level_0;

import java.util.*;

//배열 만들기 2
public class L0_31 {
	static int[] solution(int l, int r) {
		List<Integer> list = new ArrayList<Integer>();

		for(int i = l; i <= r; i++) {
			boolean chk = true;
			String str = i + "";

			for(char ch : str.toCharArray()) {
				if(ch != '0' && ch != '5') {
					chk = false;
				}
			}
			if(chk) {
				list.add(i);
			}
		}
		if(list.isEmpty()) {
			list.add(-1);
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i); 
		}

		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();

		System.out.println(solution(l, r));
	}
}
