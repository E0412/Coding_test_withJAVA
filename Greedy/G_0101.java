import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//씨름 선수
class Body implements Comparable<Body> { //좌표 정렬 
	public int h, w;
	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) { //정렬 기준 
		return o.h - this.h; //음수값 return -> 내림차순
	}
}

public class G_0101 {
	public int solution(ArrayList<Body> arr, int n) {
		int cnt = 0; //선발되는 인원 수 
		Collections.sort(arr);
		int max = Integer.MIN_VALUE; //최대 값 찾기
		for(Body ob : arr) {
			if(ob.w > max) { //몸무게 비교 
				max = ob.w;
				cnt++; 
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		G_0101 T = new G_0101();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> arr = new ArrayList<Body>();
		for (int i = 0; i < n; i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Body(h, w)); //body 객체 할당 
		}
		System.out.println(T.solution(arr, n));
	}
}
