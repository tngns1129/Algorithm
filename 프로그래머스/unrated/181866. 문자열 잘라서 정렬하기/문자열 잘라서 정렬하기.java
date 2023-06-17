import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        ArrayList <String> list = new ArrayList<>();
        String[] answer;
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].equals(""))
                list.add(arr[i]);
        }
        answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}