import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int index;
        HashMap <Integer, Integer> xMap = new HashMap<>();
        HashMap <Integer, Integer> yMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < X.length(); i++){
            if(!xMap.containsKey(X.charAt(i)- '0')){
                xMap.put(X.charAt(i)- '0', 1);
            } else{
                xMap.replace(X.charAt(i)- '0', xMap.get(X.charAt(i)- '0') + 1);
            }
        }
        for(int i = 0; i < Y.length(); i++){
            if(!yMap.containsKey(Y.charAt(i)- '0')){
                yMap.put(Y.charAt(i)- '0', 1);
            } else{
                yMap.replace(Y.charAt(i)- '0', yMap.get(Y.charAt(i)- '0') + 1);
            }
        }
        for(int i = 9; i >= 0; i--){
            if(xMap.containsKey(i) && yMap.containsKey(i)){
                System.out.println("now");
                if(xMap.get(i) > yMap.get(i)){
                    index = yMap.get(i);
                } else{
                    index = xMap.get(i);
                }
                for(int j = 0; j < index; j++){
                    sb.append(Integer.toString(i));
                }
            }
        }
        System.out.println(xMap);
        System.out.println(yMap);
        if(sb.length() == 0){
            answer = "-1";
        }else if(sb.charAt(0) == '0'){
            answer = "0";
        }else{
            answer = sb.toString();
        }
        
        return answer;
    }
}