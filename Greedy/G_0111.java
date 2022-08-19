import java.io.*;
import java.util.*;

//N이 1이 될 때까지
/*
 * 어떤 수 N이 K로 나누어 떨어질 때만 선택할 수 있다
 * 1. N에서 1을 뺀다
 * 2. N을 K로 나눈다
 * 위의 과정을 수행해야하는 최소 횟수 구하기 
 */
public class G_0111 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		//주어진 N에 대하여 최대한 많이 나누기를 수행한다
		while(true) {
			//N이 K로 나누어 떨어지는 수가 될 때까지 뺀다
			int target = (N / K) * K; //K로 나누어 떨어지는 수 
			result = result + (N - target);
			N = target;
			
			//N이 K보다 작을 때(나눌 수 x) break
			if(N < K) break;
			
			//K로 나누는 연산 수행 
			result += 1; //연산을 수행할때마다 ++
			N = N / K;
		}
		//마지막으로 남은 수에 대하여 1씩 빼기 
		result = result + (N - 1);
		System.out.println(result);
	}
}
