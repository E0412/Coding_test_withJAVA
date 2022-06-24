package solution;

import java.io.*;
import java.util.*;

//단어의 개수
//split을 사용하면 null이 아닌 빈 문자열이 반환되기 때문에 StringTokenizer를 사용한다
public class B_1152 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
	}
}
