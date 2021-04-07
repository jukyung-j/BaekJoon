package BaekJoon;
import java.io.*;
import java.util.*;

public class Resignation {
	static int[] t;
	static int[] p;
	static int[] dp;
	
	public static int MaxBenefit(int n) {
		if((n+t[n]>t.length-1) || n == t.length-1) {
			return 0;
		}
		if(dp[n] != 0) return dp[n];
		return dp[n] = Math.max(MaxBenefit(n+t[n])+p[n], MaxBenefit(n+1));
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n=0;
		int max;
		
		n = Integer.parseInt(br.readLine());
		t = new int[n+1];
		p = new int[n+1];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}

		dp = new int[n+1];
		max = MaxBenefit(0);
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
		
	}
}
