package level_2;

//스킬트리
public class L2_38 {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		//skill의 순서대로 skill_trees[i]의 값이 나오면 answer++
		for(int i = 0; i < skill_trees.length; i++) {

			//skill_trees 하나씩 검사
			for(int j = 0; j < skill_trees[i].length(); j++) {
				char ch = skill_trees[i].charAt(j);

				//수정필요 : 순서대로 나오는지 알 수 없음 
				if(skill.contains(String.valueOf(ch))) {
					continue;
				}

			}         
		}
		return answer;
	}
}
