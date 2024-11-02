package solution;

import java.io.*;
import java.util.*;

//반복하지 않는 수
public class B_7696 {

	static boolean[] flag = new boolean[10];

	static boolean check(int cnt) {
		Arrays.fill(flag, false);

		//중복체크
		while(cnt > 0) {
			int num = cnt % 10;

			if(flag[num]) {
				return true;
			}

			flag[num] = true;
			cnt /= 10;
		}	
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Integer> list = new ArrayList<>();

		// n번째 반복 숫자 없는 수를 출력, 메모리 초과를 주의
		int num = 1;
		while(list.size() < 1000001) {
			//중복이 아닌 경우 추가
			if(!check(num)) {
				list.add(num);
			}
			num++; //숫자 증가 
		}

		//n = 0인 경우 프로그램을 종료
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			bw.write(list.get(n - 1) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
