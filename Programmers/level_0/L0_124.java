package level_0;

//로그인 성공?
public class L0_124 {
	public String solution(String[] id_pw, String[][] db) {
		String answer = "";
		for (int i = 0; i < db.length; i++) {
			//아이디, 비밀번호 전부 일치
			if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
				answer = "login";
				break;
			} 
			//아이디 일치, 비밀번호 틀림
			else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
				answer = "wrong pw";
				break;
			} else {
				answer = "fail";
			}
		}
		return answer;
	}
}
