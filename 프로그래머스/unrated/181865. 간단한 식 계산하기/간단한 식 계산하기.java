class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        int a,b;
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[2]);
        if(arr[1].equals("+")){
            answer = a+b;
        }else if(arr[1].equals("-")){
            answer = a-b;
        }else if(arr[1].equals("*")){
            answer = a*b;
        }
        return answer;
    }
}