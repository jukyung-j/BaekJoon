package BaekJoon;


import java.io.*;
import java.util.*; //import



public class Queue1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		Queue<Integer> queue = new LinkedList<>();
		
		String str;
		int n=Integer.parseInt(br.readLine());
		int num;
		int back=0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			str = st.nextToken();
			switch(str) {
			case "push":
				num = Integer.parseInt(st.nextToken());
				queue.add(num);
				back = num;
				break;
			case "pop":
				if(queue.isEmpty()) {
					System.out.println(-1);
					break;
				}
				System.out.println(queue.poll());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(queue.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if(queue.isEmpty()) {
					System.out.println(-1);
					break;
				}
				System.out.println(queue.peek());
				break;
			case "back":
				if(queue.isEmpty()) {
					System.out.println(-1);
					break;
				}
				System.out.println(back);
				break;
			}
		}
	}
}
