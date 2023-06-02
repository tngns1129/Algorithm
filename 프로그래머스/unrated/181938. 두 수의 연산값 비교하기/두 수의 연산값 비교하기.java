class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(sum(a,b) >= 2*a*b){
            answer = sum(a,b);
        }else{
            answer = 2*a*b;
        }
        return answer;
    }
    public int sum(int a, int b){
        String s = Integer.toString(a) + Integer.toString(b);
        return Integer.parseInt(s);
    }
}