class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr.length, max = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(min > i){
                    min = i;
                }
                if(max < i){
                    max = i;
                }
            }
        }
        int[] answer;
        if(min==arr.length){
            answer = new int[1];
            answer[0] = -1;
        } else{
            answer = new int [max-min+1];
            for(int i = min; i <= max; i++){
                answer[i-min] = arr[i];
            }
        }
        return answer;
    }
}