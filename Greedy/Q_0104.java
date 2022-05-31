import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//최대 수입 스케쥴(Priority Queue)
class Lecture implements Comparable<Lecture> {
	public int money;
	public int date;
	Lecture(int money, int date) {
		this.money = money;
		this.date = date;
	}
	@Override
	public int compareTo(Lecture o) {
		return o.date - this.date;//내림차순 
	}
}
public class Q_0104 {
	static int n, max = Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		//큰 값을 우선순위로한다 
		Collections.sort(arr); //날짜에 의하여 내림차순 정렬
		int j = 0;
		for(int i = max; i>=1; i--) { //하루씩 작아진다 
			for(; j<n; j++) {
				if(arr.get(j).date<i) break;
				pQ.offer(arr.get(j).money); //강연료 할당
			}
			if(!pQ.isEmpty()) answer += pQ.poll(); //강연들 중 가장 큰 값을 할당
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Q_0104 T = new Q_0104();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<Lecture>();
		for (int i = 0; i < n; i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture(m, d)); //객체 생성
			if(d>max) max = d; //날짜중 가장 큰 값 
		}
		System.out.println(T.solution(arr));
	}
}
