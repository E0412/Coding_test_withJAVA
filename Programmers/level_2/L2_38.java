package level_2;

//스킬트리
public class L2_38 {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		//skill의 순서대로 skill_trees[i]의 값이 나오면 answer++
		for(int i = 0; i < skill_trees.length; i++) {
			StringBuilder sb = new StringBuilder();

			//skill_trees 하나씩 검사
			for(int j = 0; j < skill_trees[i].length(); j++) {
				char ch = skill_trees[i].charAt(j);

				//c가 skill에 있는 문자면 sb에 추가
				if(skill.indexOf(ch) != -1) {
					sb.append(ch);
				}
			}         
			//sb가 skill 순서대로 출력되는지 확인
			if(skill.startsWith(sb.toString())) {
				answer++;
			}
		}
		return answer;
	}
}
