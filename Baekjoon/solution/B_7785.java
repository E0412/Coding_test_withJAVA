package solution;

import java.io.*;
import java.util.*;

//회사에 있는 사람
public class B_7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < N; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());
			String K = st.nextToken();
			String V = st.nextToken();

			//동일한 값이 나오는 경우 leave -> key값 삭제
			if(map.containsKey(K)) {
				map.remove(K);
			} else {
				map.put(K, V);
			}
		}
		//map에 저장된 이름을 list에 추가
		List<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder()); //역순으로 출력

		for(String answer : list) {
			bw.write(answer + "\n");
		}
		bw.flush();
		bw.close();
	}
}
