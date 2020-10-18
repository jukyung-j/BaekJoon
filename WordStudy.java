package BaekJoon;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WordStudy{
    public static void main(String[] args) throws IOException{

    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String temp = br.readLine();
    	String[] input = temp.split("");
    	int[] count = new int[26];
    	char result = 0,ch;
    	int max=0,index;
    	
    	for(int i=0;i<input.length;i++) {
    		ch = input[i].toUpperCase().charAt(0);
    		index = (int)(ch-65);
    		count[index]++;    		
    	}
    	for(int i=0;i<count.length;i++) {
    		if(max<count[i]) {
    			max = count[i];
    			result = (char)(i+65);
    		}
    		else if(max == count[i])
    			result = '?';
    	}
    	
    	bw.write(result);
    	bw.flush();
    	br.close();
    }  
}

