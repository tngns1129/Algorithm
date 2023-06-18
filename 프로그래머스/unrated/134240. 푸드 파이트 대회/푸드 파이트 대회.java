import java.util.ArrayList;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++)
                list.add(i);
        }
        for(int i = 0; i < list.size(); i++){
            stringBuilder.append(Integer.toString(list.get(i)));
        }
        stringBuilder.append("0");
        for(int i = 0; i < list.size(); i++){
            stringBuilder.append(Integer.toString(list.get(list.size()-i-1)));
        }
        return stringBuilder.toString();
    }
}