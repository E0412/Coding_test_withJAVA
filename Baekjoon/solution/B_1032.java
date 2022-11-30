package solution;

import java.io.*;

//명령 프롬프트(문자열)
/*
 * 패턴에는 알파벳과 '.', '?'만 넣을 수 있다 
 * 검색 결과가 주어졌을 때, 중복되지 않는 파일명을 ? 로 출력
 */
public class B_1032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine()); //결과 개수

		String input[] = new String[tc]; //파일이름 저장 배열

		//파일이름 할당 
		for (int i = 0; i < tc; i++) {
			input[i] = br.readLine();
		}

		//input[0].length() 크기만큼 반복
		for (int i = 0; i < input[0].length(); i++) {
			boolean check = true; //i번째 단어가 같은지 검증
			char ch = input[0].charAt(i);

			//파일의 단어가 다를 경우 
			for (int j = 1; j < tc; j++) {
				if(ch != input[j].charAt(i))
					check = false;
			}
			//파일의 단어가 동일하면 그대로 출력
			if(check) {
				bw.write(ch + "");
			} else { //다른경우 ?로 바꿔 출력 
				bw.write("?");
			}
		}
		bw.flush();
		bw.close();
	}
}

