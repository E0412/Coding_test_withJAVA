import java.io.*;
import java.util.PriorityQueue;

//절대값 힙(Priority Queue)
//B_11268
public class PQ_0110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //연산의 개수 
		
		//우선순위 큐 정렬기준 적용 
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>((o1, o2) -> {
			int first = Math.abs(o1); //Math.abs -> 절댓값을 반환
			int second = Math.abs(o2);
			
			//절대값이 같으면 음수 우선 정렬
			if(first == second) 
				return o1 > o2 ? 1 : -1;
				//절대값을 기준으로 정렬
				else return first - second;
		});
		
		for (int i = 0; i < N; i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				//큐가 비어있으면 0
				if(pQ.isEmpty()) System.out.println("0");
				//비어있지 않으면 front 값 출력(poll) 
				else System.out.println(pQ.poll());
			} else { //요청이 1일 때 새로운 데이터를 우선순위 큐에 더한다(add)
				pQ.add(request);
			}
		}
	}
}
