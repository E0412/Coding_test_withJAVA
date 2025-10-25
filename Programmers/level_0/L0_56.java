package level_0;
import java.util.*;

//할 일 목록
public class L0_56 {
	public String[] solution(String[] todo_list, boolean[] finished) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < todo_list.length; i++) {
			//false인 겨우 저장
			if(finished[i] == false) {
				list.add(todo_list[i]);
			}
		}

		String[] answer = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
