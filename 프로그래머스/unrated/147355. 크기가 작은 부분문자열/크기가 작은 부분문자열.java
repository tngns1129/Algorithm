class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = p.length(); i <= t.length(); i++){
            if(Long.parseLong(t.substring(i-p.length(),i)) <= Long.parseLong(p)){
                answer ++;
            }
        }
        return answer;
    }
}