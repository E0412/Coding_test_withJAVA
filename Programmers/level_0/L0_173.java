package level_0;

//OX퀴즈
public class L0_173 {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		int idx = 0;
		
		for(String s : quiz) {
			String[] arr = s.split(" ");

			int x = Integer.parseInt(arr[0]);
			String str = arr[1];
			int y = Integer.parseInt(arr[2]);
			int z = Integer.parseInt(arr[4]);
			if(str.equals("+")) {
				answer[idx] = (x + y) == z ? "O" : "X";
			} else {
				answer[idx] = (x - y) == z ? "O" : "X";
			}
			idx++;
		}
		return answer;
	}
}
