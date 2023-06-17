class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String replacedString = myString.replace("A", "C")
                                       .replace("B", "A")
                                       .replace("C", "B");
        if(replacedString.contains(pat)){answer = 1;}
        return answer;
    }
}