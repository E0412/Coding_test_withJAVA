import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//좌표 정렬
class Point implements Comparable<Point> {
	
	public int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point p) {
		if(this.x == p.x) return this.y-p.y; //오름차순 
		else return this.x - p.x; //내림차순
	}
}
public class S_0207 {
	public static void main(String[] args) {
		S_0207 T = new S_0207();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<Point>();
		for (int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y)); //arrayList에 할당 
		}
		Collections.sort(arr); //정렬
		for(Point o : arr) System.out.println(o.x + " " + o.y);
	}
}
