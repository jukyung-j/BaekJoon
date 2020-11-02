package BaekJoon;

import java.util.*;

public class Sangsu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		SangSuAnswer sa = new SangSuAnswer(num1,num2);
		sa.answer();
	}
}
class SangSuAnswer{
	int num1,num2;
	StringBuilder n1 = new StringBuilder();
	StringBuilder n2 = new StringBuilder();
	
	SangSuAnswer(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public void answer(){
		n1.append(this.num1);
		n2.append(this.num2);
		
		num1 = Integer.parseInt(n1.reverse().toString());
		num2 = Integer.parseInt(n2.reverse().toString());
		
		System.out.println((num1>num2?num1:num2));
	}
}