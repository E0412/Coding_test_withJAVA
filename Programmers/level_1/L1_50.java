package level_1;

//비밀지도
public class L1_50 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[arr1.length];
		//비트 연산자 int num = arr1[i] | arr2[i];를 이용하여 풀이할 수 있음
		for (int i = 0; i < arr1.length; i++) {
			StringBuilder sb = new StringBuilder();

			String s1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
			String s2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');

			for (int j = 0; j < s1.length(); j++) {
				sb.append(s1.charAt(j) == '0' && s2.charAt(j) == '0' ? ' ' : '#');
			}
			answer[i] = sb.toString();
		}
		return answer;
	}
}
