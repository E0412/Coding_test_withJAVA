package level_0;

//캐릭터의 좌표
public class L0_153 {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = {0, 0}; //시작 좌표
		//최대, 최소 좌표
		int minX = -(board[0]/2);
		int maxX = board[0]/2;
		int minY = -(board[1]/2);
		int maxY = board[1]/2;

		for(int i = 0; i < keyinput.length; i++) {
			if(keyinput[i].equals("left")) {
				//범위 검증 후 좌표 이동
				if(answer[0] > minX) answer[0]--;
			} else if(keyinput[i].equals("right")) {
				if(answer[0] < maxX) answer[0]++;
			} else if(keyinput[i].equals("up")) {
				if(answer[1] < maxY) answer[1]++;
			} else if(keyinput[i].equals("down")) {
				if(answer[1] > minY) answer[1]--;
			}
		}
		return answer;
	}
}
