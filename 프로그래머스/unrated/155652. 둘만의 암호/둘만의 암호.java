import java.util.ArrayList;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int[] arr = new int [s.length()];
        ArrayList <Character> skiplist = new ArrayList<Character> ();
        for (int i = 0; i < skip.length(); i++) {
            skiplist.add(skip.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            arr[i] = (int)s.charAt(i);
        }
        for(int i = 0; i < s.length(); i++){
            for(int k = 0; k < index; k++){
                arr[i]=arr[i]+1;
                if(arr[i]>122){
                    arr[i] = arr[i]-26;
                }
                if(skiplist.contains((char)arr[i])){
                    k--;
                }
            }
            
        }
        for(int i = 0; i < arr.length; i++){
            answer += (char)arr[i];
        }
        return answer;
    }
}