package solution;

import java.io.*;
import java.util.ArrayList;

//저항(ArrayList)
/*
 * 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다
 * 음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다
 */
public class B_1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<String> list = new ArrayList<>();

		//리스트에 색상 목록을 추가한다 
		list.add("black");
		list.add("brown");
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("green");
		list.add("blue");
		list.add("violet");
		list.add("grey");
		list.add("white");

		//색을 입력받는다 
		int c1 = list.indexOf(br.readLine()) * 10; //c1은 c2에 더해야하기 때문에 십의 자리로 만든다
		int c2 = list.indexOf(br.readLine());
		int c3 = list.indexOf(br.readLine());

		//저항의 값 = (c1 + c2) * c3 
		//Math.pow() -> 제곱 함수 
		long answer = (long) ((c1 + c2) * Math.pow(10, c3)); //10의 c3 제곱

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
