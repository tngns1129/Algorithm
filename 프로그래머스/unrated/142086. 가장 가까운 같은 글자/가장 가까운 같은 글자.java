import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap <Character, Integer> map = new HashMap <Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                answer[i] = i-map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            } else{
                map.put(s.charAt(i), i);
                answer[i] = -1;
            }
        }
        return answer;
    }
}