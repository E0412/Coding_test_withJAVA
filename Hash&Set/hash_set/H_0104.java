package hash_set;

import java.util.HashMap;
import java.util.Scanner;

//모든 아나그램 찾기
//Hash, Sliding window 사용, O(n) 
public class H_0104 {
	public int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) +1);
		int L = b.length()-1;
		for(int i = 0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		//a.charAt(i) 키 값
		int lt = 0;
		for(int rt = L; rt<a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
		}
			
		return answer;
	}

	public static void main(String[] args) {
		H_0104 T = new H_0104();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}

}
