import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        ArrayList <Integer> list = new ArrayList <>();
        ArrayList <Integer> scores = new ArrayList <>();
        scores.add(score[0]);
        list.add(score[0]);
        for(int i = 1; i < score.length; i++){
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            if(list.size() > k){
                scores.add(list.get(k-1));
            } else{
                scores.add(list.get(list.size()-1));
            }
        }
        answer = new int [scores.size()];
        for(int i = 0; i < scores.size(); i++){
            answer[i] = scores.get(i);
        }
        
        return answer;
    }
}