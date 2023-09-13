import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] w = new int[123];
        int temp = 0;
        int num = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 97){
                w[word.charAt(i) - 32]++;
            }else {
            	w[word.charAt(i)]++;
            }
        }
        int max = 0;
        for(int i = 0; i < w.length; i++){
            if(w[i] >= max){
            	if(w[i] == max) {
            		temp = 1;
            	}else {
            		max = w[i];
            		num = i;
            		temp = 0;
            	}
            }
        }
        if(temp == 0){
            if(max>=97 && max<=122){
                max = max - 32;
            }
            char ch = (char)num;
            System.out.println(ch);
        } else{
            System.out.println("?");
        }
        
    }
}