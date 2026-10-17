package level_2;

import java.util.*;

//주차 요금 계산
public class L2_45 {
	public int[] solution(int[] fees, String[] records) {
		//출차시간 - 입차시간 시 * 60 + 분으로 변환
		int in = 0; 
		int out = 0; 
		int minutes = 0; 

		Map<String, Integer> inMap = new HashMap<>();
		Map<String, Integer> totalMap = new TreeMap<>(); //정렬 필요

		//출차 기록이 없는 경우 생각
		//시간 계산
		for(int i = 0; i < records.length; i++) {
			String num = records[i].substring(6, 10);
			if(records[i].contains("IN")) {
				in = Integer.parseInt(records[i].substring(0, 2)) * 60 + Integer.parseInt(records[i].substring(3, 5));
				inMap.put(num, in);

			} else if(records[i].contains("OUT")) {
				out = Integer.parseInt(records[i].substring(0, 2)) * 60 + Integer.parseInt(records[i].substring(3, 5));
				in = inMap.get(num); //해당 차량의 입차 시간을 가져옴
				totalMap.put(num, totalMap.getOrDefault(num, 0) + (out - in));
				inMap.remove(num); //기존 in값 삭제
			}
		}

		//출차 기록만 있는 경우 23:59 OUT 처리
		for(Map.Entry<String, Integer> map : inMap.entrySet()) {
			String num = map.getKey();
			int inTime = map.getValue(); //입차시간
			int outTime = 23 * 60 + 59; //23:59
			totalMap.put(num, totalMap.getOrDefault(num, 0) + (outTime - inTime));
		}

		//요금 계산
		int b_time = fees[0]; //기본시간
		int b_charge = fees[1]; //기본요금
		int u_time = fees[2]; //단위시간
		int u_charge = fees[3]; //단위요금

		List<Integer> list = new ArrayList<>();

		for(int time : totalMap.values()) {
			int sum = b_charge;
			//추가 요금이 부과된 경우
			if(time > b_time) {
				int total = time - b_time;
				int t_time = (total + u_time - 1) / u_time; //나누어 떨어지지 않을때만 몫을 1 올린다
				sum +=  t_time * u_charge;
			}
			list.add(sum);   
		}

		return list.stream().mapToInt(i -> i).toArray();
	}
}
