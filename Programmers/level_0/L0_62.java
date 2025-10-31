package level_0;

//배열에서 문자열 대소문자 변환하기
public class L0_62 {
	public String[] solution(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			//짝수인 경우 소문자
			if(i % 2 == 0) {
				strArr[i] = strArr[i].toLowerCase();
			}
			//홀수인 경우 대문자
			if(i % 2 == 1) {
				strArr[i] = strArr[i].toUpperCase();
			}
		}
		return strArr;
	}
}
