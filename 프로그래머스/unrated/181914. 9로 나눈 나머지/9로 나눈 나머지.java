class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] a = number.split("");
        for(int i = 0; i < a.length; i++){
            answer += Integer.parseInt(a[i]);
        }
        answer = answer%9;
        return answer;
    }
}