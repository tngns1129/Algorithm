class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int last = myString.lastIndexOf(pat);
        answer = myString.substring(0,last + pat.length());
        return answer;
    }
}