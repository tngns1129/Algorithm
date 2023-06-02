class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum=0, mix = 1;
        for(int i = 0; i < num_list.length; i++){
            sum = sum + num_list[i];
            mix = mix * num_list[i];
        }
        if(mix < pow(sum)){
            answer = 1;
        }
        return answer;
        
    }
    public int pow(int a){
        return a*a;
    }
}