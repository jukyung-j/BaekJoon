package BaekJoon;

import java.util.*;

public class Josephus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		permutations(n,k);
	}
	static void permutations(int n,int k) {
		Queue<Integer> que = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			que.add(i);
		}
		
		
			
		
	}
}
