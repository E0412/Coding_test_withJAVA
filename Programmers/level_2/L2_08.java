package level_2;

//JadenCase 문자열 만들기
public class L2_08 {
	public String solution(String s) {
		String n = s.toLowerCase();
		String[] arr = n.split(" ");
		StringBuilder sb = new StringBuilder();
		//해당 방법을 사용시 공백이 2개이상 있는 경우 통과가 안됨 
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].isEmpty()) {
				sb.append(String.valueOf(Character.toUpperCase(arr[i].charAt(0)))).append(arr[i].substring(1, arr[i].length()));
				sb.append(" ");
			}
		}
		return sb.toString().trim();
	}
}
