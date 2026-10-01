package level_2;

import java.util.*;

//오픈채팅방
public class L2_42 {
	public String[] solution(String[] record) {
		List<String> list = new ArrayList<>();
		int[] chk = new int[record.length]; //enter면 1 leave면 0 change면 -1
		String[] idChk = new String[record.length];

		//name을 분리해서 해당하는 문자열과 아이디를 찾기
		//record[i].split()으로 해당 반복문에서 1, 2를 확인
		Map<String, String> map = new HashMap<>();
		for(int i = 0; i < record.length; i++) {
			String[] arr = record[i].split(" ");
			idChk[i] = arr[1];
			//최종 이름 저장
			if(arr.length > 2) {
				map.put(arr[1], arr[2]);
			}
			if(arr[0].equals("Enter")) {
				chk[i] = 1;            
			} else if(arr[0].equals("Leave")) {
				chk[i] = 0;
			} else {
				chk[i] = -1;
			}
		}

		//map에 저장한 값을 꺼냄
		//map.key가 string[i]랑 같으면 해당 map의 value를 꺼냄


		return list.toArray(new String[0]);
	}
}
