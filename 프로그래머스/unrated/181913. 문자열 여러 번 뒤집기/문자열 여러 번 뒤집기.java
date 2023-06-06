import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String [] new_string = my_string.split("");
        ArrayList<String> a = new ArrayList<String> ();
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                a.add(new_string[j]);
            }
            Collections.reverse(a);
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                new_string[j] = a.get(j - queries[i][0]);
            }
        }
        for(int i = 0; i < new_string.length; i++){
            answer = answer + new_string[i];
        }
        return answer;
    }
}