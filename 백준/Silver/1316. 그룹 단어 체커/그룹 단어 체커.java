import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] word = new String[num];
        boolean temp = true;
        int answer = 0;

        for(int i = 0; i<num; i++){
            word[i] = sc.next();
        }

        for(int i = 0; i<word.length; i++){
            ArrayList<Character> charList = new ArrayList<>();
            char[] charArray = word[i].toCharArray();
            temp = true;
            for (char c : charArray) {
                if(charList.contains(c)){
                    if(charList.get(charList.size()-1) == c){
                        charList.add(c);
                    }else{
                        temp = false;
                    }
                }else {
                    charList.add(c);
                }
            }
            if(temp){
                answer++;
            }
        }
        System.out.println(answer);
    }
}