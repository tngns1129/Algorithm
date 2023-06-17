class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int same=0, nosame=0;
        for(int i = 0; i < s.length(); i++){
            if(x == s.charAt(i)){
                same++;
            } else{
                nosame++;
            }
            if(i != s.length()-1){
                if(same == nosame){
                    answer++;
                    x = s.charAt(i+1);
                    same = 0;
                    nosame = 0;
                }
            } else{
                answer++;
            }
        }
        return answer;
    }
}