class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int c1=0,c2=0,right = 0;
        for(int i = 0; i < goal.length; i++){
            if(goal[i].equals(cards1[c1])){
                right++;
                if(c1 < cards1.length-1)
                    c1++;
            } else if(goal[i].equals(cards2[c2])){
                right++;
                if(c2 < cards2.length-1)
                    c2++;
            } else{
                answer = "No";
            }
            if(right == goal.length){
                answer = "Yes";
            } 
        }
        return answer;
    }
}