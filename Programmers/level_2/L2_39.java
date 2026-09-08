package level_2;

import java.util.Comparator;

//가장 큰 수
public class L2_39 {
	public String solution(int[] numbers) {
		StringBuilder sb = new StringBuilder();
		//comparator로 순서 결정
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2) {
					//수정 필요 : comparator에서 정렬이 끝난 후 담아야함, 두자리 수 구분이 어려움
					sb.append(String.valueOf(o1)).append(String.valueOf(o2));
				} else if(o1 < o2) {
					sb.append(String.valueOf(o2)).append(String.valueOf(o1));
				}
				return 0;
			}
		};
		return sb.toString();
	}
}
