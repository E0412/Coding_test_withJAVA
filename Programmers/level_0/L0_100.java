package level_0;

import java.util.ArrayList;
import java.util.List;

//햄버거 만들기
public class L0_100 {
	public int solution(int[] ingredient) {
		List<Integer> list = new ArrayList<Integer>();
		int answer = 0;

		for(int i : ingredient) {
			list.add(i);

			//list에 원소가 4개 이상인 경우 실행
			if(list.size() > 3) {
				int n = list.size(); //현재 크기 저장

				//1231이 순서대로 존재하는 경우
				if(list.get(n - 4) == 1 && list.get(n - 3) == 2 && list.get(n - 2) == 3 && list.get(n - 1) == 1) {
					answer++;

					//해당하는 원소 삭제
					list.remove(n - 1);
					list.remove(n - 2);
					list.remove(n - 3);
					list.remove(n - 4);
				}
			}
		}
		return answer;
	}
}
