import java.util.Stack;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String [] arr = my_string.split("");
        Stack<String> stack = new Stack<>();
        for(int i = s; i <= e; i++){
            stack.push(arr[i]);
        }
        for(int i = s; i <= e; i++){
            arr[i] = stack.peek();
            stack.pop();
        }
        for(int i = 0; i < arr.length; i++){
            answer = answer + arr[i];
        }
        return answer;
    }
}