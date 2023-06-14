import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] newArray = arr.clone();
        do{
            arr = newArray.clone();
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i]%2 == 0){
                    newArray[i] = arr[i]/2;
                } else if(arr[i] < 50 && arr[i]%2 == 1){
                    newArray[i] = arr[i]*2 + 1;
                } else{
                    newArray[i] = arr[i];
                }
            }
            answer++;
        } while(!Arrays.equals(newArray, arr));
        return answer-1;
    }
}