import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList <Integer> a = new ArrayList<Integer>();
        String split;
        for(int i = 0; i < intStrs.length; i++){
            
            split = intStrs[i].substring(s,s+l);
            if(Integer.parseInt(split) > k){
                a.add(Integer.parseInt(split));
            }
        }
        int[] answer = new int[a.size()];
        for(int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}