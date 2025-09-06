package level_0;

//문자열 섞기
public class L0_08 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		
		for (int i = 0; i < str1.length(); i++) {
			char a = str1.charAt(i); 
			char b = str2.charAt(i);
			
			sb.append(a).append(b);
		}
		
		String answer = sb.toString();
		
		System.out.println(answer); //return answer
	}
}
