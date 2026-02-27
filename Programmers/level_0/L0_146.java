package level_0;

//모스부호 (1)
public class L0_146 {
	public String solution(String letter) {
		StringBuilder sb = new StringBuilder();
		String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

		String[] s = letter.split(" ");

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j].equals(s[i])) {
					sb.append((char)('a' + j));
				}
			}
		}
		return sb.toString();
	}
}
