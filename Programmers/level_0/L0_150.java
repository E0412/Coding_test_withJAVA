package level_0;

//외계어 사전
public class L0_150 {
	public int solution(String[] spell, String[] dic) {
		int answer = 1;
		int cnt = 0;
		for(int i = 0; i < dic.length; i++) {
			for(int j = 0; j < spell.length; j++) {
				if(spell[j].equals(dic[i])) {
					cnt++;
				} 
				if(cnt == spell.length) {
					answer = 2;
					break;
				}
			}
			cnt = 0;
		}
		return answer;
	}
}
