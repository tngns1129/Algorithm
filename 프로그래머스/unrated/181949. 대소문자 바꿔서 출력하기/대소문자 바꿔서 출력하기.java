import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String out = "";
        int str_int;
        for(int i = 0; i < a.length(); i++){
            str_int = a.charAt(i);
                if(str_int<=90){
                    out = out + (char)(str_int+32);
                }else{
                    out = out + (char)(str_int-32);
                }
        }
        System.out.println(out);
    }
}