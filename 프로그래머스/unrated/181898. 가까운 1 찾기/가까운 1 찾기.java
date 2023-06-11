class Solution {
    public int solution(int[] arr, int idx) {
        int answer = arr.length;
        for(int i = idx; i<arr.length; i++){
            if(arr[i] == 1 && answer > i){
                answer = i;
            }
        }
        if(answer == arr.length){
            answer = -1;
        }
        return answer;
    }
}