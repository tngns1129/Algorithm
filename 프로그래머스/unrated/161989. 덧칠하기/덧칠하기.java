import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        ArrayList <Integer> a = new ArrayList <Integer> ();
        for(int i = 0; i < section.length; i++){
            a.add(section[i]);
        }
        while(a.size() != 0){
            int idx = a.get(0)+m-1;
            for(int i = 0; i < a.size(); i++){
                if(a.get(i) <= idx){
                    a.set(i,-1);
                }
            }
            while (a.remove(Integer.valueOf(-1))) {}
            answer++;
        }
        return answer;
    }
}