import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(a.size() == 0){
                a.add(arr[i]);
            } else if(a.get(a.size()-1) < arr[i]){
                a.add(arr[i]);
            } else if(a.get(a.size()-1) >= arr[i]){
                a.remove(a.size()-1);
                i = i-1;
            }
        }
        int[] stk = new int [a.size()];
        for(int i = 0; i < a.size(); i++){
            stk[i] = a.get(i);
        }
        return stk;
    }
}