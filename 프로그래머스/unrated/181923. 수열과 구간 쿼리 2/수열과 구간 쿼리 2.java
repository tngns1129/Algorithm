import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
        int m;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < answer.length; i++){
            answer[i] = 10000001;
        }
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(arr[j]>queries[i][2]){
                    a.add(arr[j]);
                } else{
                    a.add(-1);
                }
            }
            for(int j = 0; j < a.size(); j++){
                if(answer[i]>=a.get(j) && a.get(j) != -1){
                    answer[i] = a.get(j);
                }
            }
            a.clear();
        }
        for(int i = 0; i< answer.length; i++){
            if(answer[i]==10000001){
                answer[i]=-1;
            }
        }
        return answer;
    }
}