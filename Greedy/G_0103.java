import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//결혼식 
class Time2 implements Comparable<Time2> {
	public int time; //시간 
	public char state; //상황
	Time2(int time, char state) {
		this.time = time;
		this.state = state;
	}
	@Override
	public int compareTo(Time2 o) { //정렬기준 
		if(this.time==o.time) return this.state-o.state;
		else return this.time-o.time;
	}
}
public class G_0103 {
	public int solution(ArrayList<Time2> arr) {
		int answer = Integer.MIN_VALUE; //최대 값을 받기위해 작은값으로 초기화 
		Collections.sort(arr);
		int cnt = 0;
		for(Time2 o : arr) {
			if(o.state=='s') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		G_0103 T = new G_0103();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time2> arr = new ArrayList<Time2>();
		for (int i = 0; i < n; i++) {
			int sT = kb.nextInt();
			int eT = kb.nextInt();
			arr.add(new Time2(sT, 's'));
			arr.add(new Time2(eT, 'e'));
		}
		System.out.println(T.solution(arr));
	}
}
