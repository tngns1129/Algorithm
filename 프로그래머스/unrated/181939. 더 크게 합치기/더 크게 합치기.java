class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(sum(a,b) > sum(b,a)){
            answer = sum(a,b);
        }else{
            answer = sum(b,a);
        }
        return answer;
    }
    public int sum(int a, int b){
        String s = Integer.toString(a) + Integer.toString(b);
        return Integer.parseInt(s);
    }
}