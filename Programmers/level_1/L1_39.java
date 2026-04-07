package level_1;

import java.util.*;

//K번째 수
public class L1_39 {
	public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            //범위 수정
            for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer.add(list.get(commands[i][2] - 1));
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
