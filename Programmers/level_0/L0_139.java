package level_0;

//문자열 밀기
public class L0_139 {
	public int solution(String A, String B) {
		if(A.equals(B)) return 0; 

		//오른쪽으로 한칸씩 이동시켜서 값이 같은경우 인덱스 반환
		for(int i = 1; i <= A.length(); i++) {
			A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);           
			if(A.equals(B)) return i;
		}
		return -1;
	}
}
