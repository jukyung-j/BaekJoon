package BaekJoon;
import java.util.*;

public class Resignation {
	static int[] t;
	static int[] p;
	static int[] dp;
	
	public static int MaxBenefit(int n) {
		if((n+t[n]>t.length-1)) {
			return 0;
		}
		else if(n<t.length-1){
			if(dp[n]!=0) return dp[n];
			System.out.println("n:"+n);
			return dp[n] = Math.max(MaxBenefit(n+t[n])+p[n], MaxBenefit(n+1));
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int max;
		
		n = sc.nextInt();
		t = new int[n+1];
		p = new int[n+1];
		
		for(int i=0;i<n;i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		dp = new int[n+1];
		max = MaxBenefit(0);
		System.out.println(max);
		
	}
}
