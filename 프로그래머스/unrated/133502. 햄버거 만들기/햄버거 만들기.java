import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0, preanswer = 1;
        boolean temp = true;
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < ingredient.length; i++){
            list.add(ingredient[i]);
        }
        while(preanswer != answer){
            preanswer = answer;
            for(int i = 0; i < list.size()-3; i++){
                if(list.get(i) == 1 && list.get(i+1) == 2 && list.get(i+2) == 3 && list.get(i+3) == 1){
                    list.remove(i);
                    list.remove(i);
                    list.remove(i);
                    list.remove(i);
                    answer ++;
                    if(i > 3)
                        i = i-3;
                    else{
                        i = -1;
                    }
                }
            }
        }
        
        return answer;
    }
}