package level_0;

//외계어 사전
public class L0_150 {
	public int solution(String[] spell, String[] dic) {
		int answer = 2;
		for(int i = 0; i < dic.length; i++) {
			if(dic[i].length() == spell.length) {
				boolean chk = true;
				for(int j = 0; j < spell.length; j++) {
					if(!dic[i].contains(spell[j])) {
						chk = false;
					}
				}
				if(chk) {
					answer = 1;
					break;
				}
			}
		}
		return answer;
	}
}
