package solution;

import java.io.*;
import java.util.*;

//카드 놓기(Deque)
/* 
 * 기술 사용 전 카드의 상태를 출력 
 */
public class B_18115 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();
		Deque<Integer> dq = new LinkedList<>(); //양방향으로 처리

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		//뒤에서부터 사용
		Collections.reverse(list);

		for (int i = 0; i < N; i++) {
			int p = list.get(i);

			if(p == 1) {
				dq.addFirst(i + 1); //숫자를 앞에 저장 
			} else if(p== 2) {
				//앞에 저장된 숫자를 제거 후 저장한다
				int tmp = dq.remove();
				dq.addFirst(i + 1); 
				dq.addFirst(tmp);
			} else { //숫자를 뒤에서 추가 
				dq.addLast(i + 1);
			}
		}

		while(!dq.isEmpty()) {
			bw.write(dq.remove() + " ");
		}
		bw.flush();
		bw.close();
	}
}
