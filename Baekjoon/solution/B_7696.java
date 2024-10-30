package solution;

import java.io.*;
import java.util.*;

//반복하지 않는 수
public class B_7696 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<>();
		boolean[] flag = new boolean[10];
		
		// n번째 반복 숫자 없는 수를 출력, 메모리 초과를 주의
		
		
		//n = 0인 경우 프로그램을 종료
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
		}
		bw.write("");
		bw.flush();
		bw.close();
	}
}
