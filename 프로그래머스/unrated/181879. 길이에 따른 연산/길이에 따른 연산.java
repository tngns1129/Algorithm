class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0, prod = 1,i;
        if(num_list.length >= 11){
            for(i=0; i<num_list.length; i++){
                sum = sum + num_list[i];
            }
            answer = sum;
        }
        else if(num_list.length < 11){
            for(i=0; i<num_list.length; i++){
                prod = prod * num_list[i];
            }
            answer = prod;
        }
        return answer;
    }
}