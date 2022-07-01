package solution;

import java.io.*;

//그룹 단어 체크
public class B_1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//main과 check 함수에서 사용하기 때문에 전역변수로 생성

	public static void main(String[] args) throws IOException{
		int count = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() throws IOException { //전역 메서드로 생성
		boolean check[] = new boolean[26];
		int prev = 0; //앞선 문자와 연속되는지 확인하는 변수
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i); //i번째 값 저장
			
			//앞선문자와 i번째 문자 비교
			if(prev != now) {
				//해당 문자가 처음 나오는 경우(false)
				if(check[now - 'a'] == false) { //인덱스에 a부터 체크
					check[now - 'a'] = true; //true로 변환
					prev = now; //prev도 변환
				}
				//그룹단어가 아닌경우(이전에 나온 문자)
				else {
					return false;
				}
			}
		}
		return true;
	}
}
