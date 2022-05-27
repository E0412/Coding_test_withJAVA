package solution;

import java.io.*;

//OX퀴즈
public class B_8958 {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        int input = Integer.parseInt(br.readLine());
	        String arr[] = new String[input];
	        for(int i = 0; i<input; i++) {
	            arr[i] = br.readLine();
	        }
	        for(int i = 0; i<input; i++) {
	            int cnt = 0;
	            int sum = 0;
	                for(int j = 0; j<arr[i].length(); j++) {
	                    if(arr[i].charAt(j)=='O') {
	                        cnt++;
	                    } else cnt = 0;
	                    sum += cnt;
	                }
	            sb.append(sum).append('\n');
	        }
	        System.out.print(sb);
	    }
	}
