package level_1;

//핸드폰 번호 가리기
public class L1_15 {
	public String solution(String phone_number) {
		StringBuilder sb = new StringBuilder();
		//전화번호 끝자리 4개를 제외하고 *으로 가린다
		for(int i = 0; i < phone_number.length()-4; i++) {
			sb.append("*");
		}
		sb.append(phone_number.substring(phone_number.length()-4, phone_number.length()));
		return sb.toString();
	}
}
