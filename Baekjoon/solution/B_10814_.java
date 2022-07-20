package solution;

import java.io.*;
import java.util.*;

//나이순 정렬(카운팅 정렬)
public class B_10814_ {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		//입력되는 나이의 범위
		StringBuilder[] sbArr = new StringBuilder[201];
		
		//객체 배열의 인덱스에 각 StringBuilder 객체를 생성한다
		for (int i = 0; i < sbArr.length; i++) {
			sbArr[i] = new StringBuilder();
		}
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			//카운팅 정렬 -> 나이를 index로 하여 해당 배열에 나이와 이름을 할당
			sbArr[age].append(age).append(' ').append(name).append('\n');
		}
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder answer : sbArr) {
			sb.append(answer);
		}
		System.out.println(sb);
	}
}
