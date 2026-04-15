package level_1;

//푸드 파이트 대회
public class L1_40 {
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		//음식을 동일한 개수로 나눈 후 번호를 담는다 
		for(int i = 1; i < food.length; i++) {
			for(int j = 0; j < food[i] / 2; j++) {
				sb.append(i);
			}
		}
		//상대 선수 음식 = 저장된 값의 역순
		StringBuilder resb = new StringBuilder(sb);
		sb.append("0").append(resb.reverse());

		return sb.toString();
	}
}
