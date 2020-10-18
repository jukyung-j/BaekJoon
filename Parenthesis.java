package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parenthesis_String prs = new Parenthesis_String();
		int count = Integer.parseInt(sc.nextLine());
		String input;
		for(int i=0;i<count;i++) {
			input = sc.nextLine();
			prs.ps(input);
		}
	}
	
}
class Parenthesis_String{
	void ps(String input) {
		String result = null;
		String[] temp = input.split("");
		Stack<String> st = new Stack<String>();
		for(int i=0;i<input.length();i++) {
			if(temp[i].equals("(")) {
				st.push(temp[i]);
			}
			else if(temp[i].equals(")")) {
				if(!st.isEmpty()) {
					if((st.peek()).equals("(")) {
						st.pop();
					}
					else
						st.push(temp[i]);
				}
				else
					st.push(temp[i]);
			}
		}
		if(st.isEmpty())
			result="YES";
		else
			result="NO";
		System.out.println(result);
	}
}
