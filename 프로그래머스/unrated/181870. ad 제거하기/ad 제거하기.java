import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList <String> list = new ArrayList<>();
        for(String a : strArr){
            if(!a.contains("ad")){
                list.add(a);
            }
        }
        answer = list.toArray(new String[0]);
        return answer;
    }
}