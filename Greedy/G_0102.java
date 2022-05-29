import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//회의실 배정 
class Time implements Comparable<Time> {
	public int s, e; //start, end
	Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) return this.s-o.s;
		else return this.e-o.e;
	}
}
public class G_0102 {
	public int solution(ArrayList<Time> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int et = 0; //회의가 끝나는 시간 
		for(Time ob : arr) { 
			if(ob.s>=et) { //ob의 start 시간이 et보다 크거나 같을 때 
				cnt++;
				et = ob.e;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		G_0102 T = new G_0102();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<Time>();
		for (int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Time(x, y));
		}
		System.out.println(T.solution(arr, n));
	}
}
