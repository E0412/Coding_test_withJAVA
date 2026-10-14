package level_2;

import java.util.*;

//주차 요금 계산
public class L2_45 {
	public int[] solution(int[] fees, String[] records) {
		int[] answer = {};
		//출차시간 - 입차시간 시 * 60 + 분으로 변환
		int in = 0; 
		int out = 0; 
		int minutes = 0; 

		Map<String, Integer> map = new HashMap<>();

		//출차 기록이 없는 경우 생각
		//시간 계산
		for(int i = 0; i < records.length; i++) {
			String num = records[i].substring(6, 10);
			if(records[i].contains("IN")) {
				in = Integer.parseInt(records[i].substring(0, 2)) * 60 + Integer.parseInt(records[i].substring(3, 5));
				map.put(num, in);

			} else if(records[i].contains("OUT")) {
				out = Integer.parseInt(records[i].substring(0, 2)) * 60 + Integer.parseInt(records[i].substring(3, 5));
				map.put(num, map.getOrDefault(num, 0) + (out - in));
			}
		}

		//요금 계산 - 무료 주차시간 생각
		for(int i = 0; i < fees.length; i++) {

		}


		return answer;
	}
}
