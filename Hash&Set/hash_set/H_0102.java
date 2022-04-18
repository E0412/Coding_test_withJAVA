package hash_set;

import java.util.HashMap;
import java.util.Scanner;

//아나그램 
public class H_0102 {
	public String solution(String n, String m) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : n.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x2 : m.toCharArray()) {//key값이 존재하는지 확인
			if(!map.containsKey(x2) || map.get(x2)==0) return "NO";
			map.put(x2, map.get(x2)-1); //containsKey로 세팅을 했기때문에 get만 사용
		}
		return answer;
	}
	
	public static void main(String[] args) {
		H_0102 T = new H_0102();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}

}
