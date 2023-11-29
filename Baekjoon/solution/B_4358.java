package solution;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

//생태학
/*
 * 미국 전역의 나무들이 주어졌을 때, 각 종이 전체에서 몇 %를 차지하는지 구하는 프로그램을 만든다
 */
public class B_4358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		TreeMap<String, Integer> map = new TreeMap<>(); //자동으로 정렬되는 TreeMap 이용
		String tree = ""; 
		double percent = 0; //종이 차지하는 비율

		while((tree = br.readLine()) != null) {
			//종의 이름, 개수 입력
			map.put(tree, map.getOrDefault(tree, 0) + 1); //해당하는 값에 + 1을 한다  
			percent++; 
		}

		for(Map.Entry<String, Integer> o : map.entrySet()) {
			bw.write(o.getKey() + " " + String.format("%.4f", o.getValue() / percent * 100) + "\n");
			bw.flush();
		}
		bw.close();
	}
}
