package level_0;

//공백으로 구분하기 2
public class L0_67 {
	public String[] solution(String my_string) {
		//trim() 앞 뒤 공백 제거, split \\s+ 1개이상(+) 공백(\s) 제거
		String answer[] = my_string.trim().split("\\s+");
		return answer;
	}
}
