import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> newlist = new ArrayList<>();
        for(int i = 0; i < num; i++){
            list.add(br.readLine());
        }
        for(int i = 0; i<list.size(); i++){
            if(!newlist.contains(list.get(i))){
                newlist.add(list.get(i));
            }
        }
        Collections.sort(newlist);
        String[] arr = new String[newlist.size()];
        
        for(int i = 0; i<newlist.size(); i++){
            arr[i] = newlist.get(i);
        }
        Arrays.sort(arr, (String a, String b) -> a.length() - b.length());
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}