import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] arr = my_string.split(" ");
        ArrayList <String> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].equals(""))
                list.add(arr[i]);
        }
        answer = list.toArray(new String[0]);
        return answer;
    }
}