import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList <Integer>();
        a.add(n);
        while(n != 1){
            if(n%2 == 0){
                n = n/2;
                a.add(n);
            } else {
                n = 3*n+1;
                a.add(n);
            }
        }
        int[] answer = new int [a.size()];
        for(int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}