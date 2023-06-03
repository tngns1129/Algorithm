class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        x1 = x1 || x2;
        x3 = x3 || x4;
        answer = x1 && x3;
        return answer;
    }
}