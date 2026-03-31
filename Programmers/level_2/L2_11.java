package level_2;

//이진 변환 반복하기
public class L2_11 {
	public int[] solution(String s) {
		int cnt = 0; //이진변환의 횟수
		int zero = 0; //0의 개수

		//이진처리를 반복하는 while문
		while(!s.equals("1")) { 
			StringBuilder sb = new StringBuilder(); //반복할때마다 초기화

			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '0') {
					zero++; //0의 개수 증가
				} else if(s.charAt(i) == '1') {
					sb.append(s.charAt(i)); //0이아닌 경우에만 저장
				}
			}
			//2진수 변환값 저장 (길이를 변환)
			s = Integer.toBinaryString(sb.length());
			cnt++;
		}
		return new int[]{cnt, zero};
	}
}
