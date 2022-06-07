import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//가장 높은 탑 쌓기(LIS 응용)
class Brick implements Comparable<Brick> { //벽돌의 객체 
	public int s, h, w;
	Brick(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Brick o) {
		return o.s - this.s; //내림차순
	}
}
public class D_0104 {
	static int[] dy;
	public int solution(ArrayList<Brick> arr) {
		int answer = 0;
		Collections.sort(arr);
		dy[0] = arr.get(0).h; //높이값을 저장
		answer = dy[0]; //answer 초기화, 
		for(int i = 1; i<arr.size(); i++) {
			int max_h = 0;
			for(int j = i-1; j>=0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
					max_h = dy[j];
				}
			}
			dy[i]= max_h + arr.get(i).h;//높이
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		D_0104 T = new D_0104();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Brick> arr = new ArrayList<Brick>();
		dy = new int[n];
		for(int i = 0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Brick(a, b, c));
		}
		System.out.println(T.solution(arr));
	}
}
