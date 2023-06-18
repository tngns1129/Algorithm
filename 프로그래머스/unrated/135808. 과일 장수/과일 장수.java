import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int temp = 1;
        Arrays.sort(score);
        for(int i = score.length-1; i >=0 ; i--){
            if(temp % m == 0){
                answer += score[i] * m;
            }
            temp++;
        }
        return answer;
    }
}