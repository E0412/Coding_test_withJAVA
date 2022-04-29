import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//장난꾸러기 
public class S_0206 {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		for (int i = 0; i < n; i++) {
			if(arr[i]!=tmp[i]) answer.add(i+1);
		}
		return answer;
	}

	public static void main(String[] args) {
		S_0206 T = new S_0206();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];	
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}

}
