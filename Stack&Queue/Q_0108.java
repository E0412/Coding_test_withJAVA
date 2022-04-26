import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.*;

//응급실, 몇 번째로 진료받는지 출력  
class Person {
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}
public class Q_0108 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		for(int i = 0; i<n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priority>tmp.priority) {
					Q.add(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id == k) return answer;
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Q_0108 T = new Q_0108();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}

}
