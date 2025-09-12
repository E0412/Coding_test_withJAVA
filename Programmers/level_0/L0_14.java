package level_0;


//코드 처리하기
public class L0_14 {
	public static void main(String[] args) {
		String code = "abc1abc1abc1";
		char[] arr = new char[code.length()];
		String ret = "";
		int mode = 0;

		for (int i = 0; i < code.length(); i++) {
			arr[i] = code.charAt(i);

			if(mode == 0) {
				if(i % 2 == 0 || arr[i] == '1')
					ret += arr[i];
				mode = 1;
				System.out.println(mode + " " + ret);
			} else if(mode == 1) {
				if(arr[i] != '1' && i % 2 == 1)
					ret += arr[i];
				mode = 0;
				System.out.println(mode + " " + ret);
			}

		}
	}
}
