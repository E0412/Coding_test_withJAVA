package hash_set;

import java.util.HashMap;
import java.util.Scanner;

//학급회장(hashmap) 
public class H_0101 {
		public char solution(int n, String s) {
			char answer = ' ';
			HashMap<Character, Integer> map = new HashMap<>();
			for(char x : s.toCharArray()) {
				map.put(x, map.getOrDefault(x, 0)+1);
			}
			int max = Integer.MIN_VALUE;
			for(char key : map.keySet()) {
				if(map.get(key)>max) {
					max = map.get(key);
					answer = key;
				}
			}
			return answer;
		}
	public static void main(String[] args) {
		H_0101 T = new H_0101();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}

}
