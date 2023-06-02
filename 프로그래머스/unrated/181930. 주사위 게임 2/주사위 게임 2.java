import java.lang.Math;
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        answer = a+b+c;
        if(a ==b || a ==c || b==c){
            if(a == b && b == c){
                answer = answer*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
            } else {
                answer = answer*(a*a+b*b+c*c);
            }
        }
        return answer;
    }
}