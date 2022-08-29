package solution;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

//베스트셀러(문자열, map)	
/**
* HashMap과 list 활용 
* 출력전 정렬 후 첫번째 인덱스 출력 
*/
public class B_1302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max = 0; //가장 많이 입력된 문자 
		
		//키는 String, 값은 Integer 형으로 저장
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String book = br.readLine();
			//book의 키 값을 가져오되, 없으면 0 반환
			map.put(book, map.getOrDefault(book, 0) + 1); 
			max = Math.max(max, map.get(book)); //최댓값을 출력
		}
		List<String> list = new ArrayList<String>();
		for(Entry<String, Integer> answer : map.entrySet()) {
			//최댓값으로 카운트 된 책들을 리스트에 넣는다
			if(answer.getValue() == max) {
				list.add(answer.getKey());
			}
		}
		Collections.sort(list);
		// 맨 앞에 있는 책 제목 출력
		System.out.println(list.get(0));
	}
}
