class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0, b =  0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                a++;
            } else {
                a--;
            }
            if(a < 0){
                answer = false;
            }
        }
        if(a != 0){
                answer = false;
            }

        return answer;
    }
}