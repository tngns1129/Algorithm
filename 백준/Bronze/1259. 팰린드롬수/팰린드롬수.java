import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean loop = true;
        int index = 0;
        ArrayList <String> list = new ArrayList<>();
        while(loop){
            String a = br.readLine();
            index = 0;
            for(int i = 0; i < a.length()/2; i++){
                if(a.charAt(i) != a.charAt(a.length()-i-1)){
                    index = 1;
                    break;
                }
            }
            if(a.equals("0")){
                loop = false;
            }
            if(loop){
                if(index == 1){
                    list.add("no");
                    //System.out.println("no");
                } else if (index == 0){
                    list.add("yes");
                    //System.out.println("yes");
                }
            }
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}