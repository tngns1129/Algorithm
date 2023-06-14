class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] answer = new int [num_list.length];
        for(int i = n; i < num_list.length + n; i++){
            if(i > num_list.length-1){
                answer[i-n] = num_list[i%num_list.length];
            } else{
                answer[i-n] = num_list[i];
            }
        }
        return answer;
    }
}