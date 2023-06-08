class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int [52];
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i) > 95)
                answer[my_string.charAt(i)-65-6]++;
            else {
                answer[my_string.charAt(i)-65]++;
            }
        }
        return answer;
    }
}