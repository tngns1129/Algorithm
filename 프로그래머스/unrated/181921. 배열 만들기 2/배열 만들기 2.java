import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 1; i <= 63; i++){
            String binaryString = Integer.toBinaryString(i);
            int num = Integer.parseInt(binaryString);
            num *= 5;
            ans.add(num);
        }
        ans.removeIf(item -> item < l);
        ans.removeIf(item -> item > r);
        System.out.println(ans.size());
        if(ans.size() == 0){
            ans.add(-1);
        }
        int[] answer = new int [ans.size()];
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}