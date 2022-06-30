package solution;

import java.io.*;
import java.util.*;

//그룹 단어 체크
public class B_1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		int N  = Integer.parseInt(br.readLine());
		
		//카드를 큐에 저장
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		//카드가 1장 남을때까지 반복
		while(queue.size() > 1) {
			queue.poll(); //맨 위의 카드를 버린다
			queue.add(queue.poll()); //맨 위의 카드를 가장 아래 카드 밑으로
		}
		System.out.println(queue.poll());
	}
}
