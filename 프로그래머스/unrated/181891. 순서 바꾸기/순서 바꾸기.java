class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [num_list.length];
        int[] left = new int[n];
        int[] right = new int[num_list.length - n];
        for(int i = 0; i < n; i++){
            left[i] = num_list[i];
        }
        for(int i = n; i < num_list.length; i++){
            right[i-n] = num_list[i];
        }
        for(int i = 0; i < answer.length; i++){
            if(i < num_list.length - n){
                answer[i] = right[i];
            } else if (i >= num_list.length - n){
                answer[i] = left[i-num_list.length+n];
            }
        }
        return answer;
    }
}