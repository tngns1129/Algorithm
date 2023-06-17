class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int i = 0;
        while(myString.indexOf(pat,i) != -1){
            answer++;
            i = myString.indexOf(pat,i) + 1;
        }
        return answer;
    }
}