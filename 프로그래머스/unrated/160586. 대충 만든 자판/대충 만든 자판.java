import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int min;
        HashMap <Character, Integer> map = new HashMap <>();
        for(int i = 0; i < keymap.length; i++){
            min = keymap[i].length();
            for(int j = 0; j < keymap[i].length(); j++){
                if(!map.containsKey(keymap[i].charAt(j))){
                    map.put(keymap[i].charAt(j),j+1);
                } else{
                    if(map.get(keymap[i].charAt(j)) > j){
                        map.replace(keymap[i].charAt(j), j+1);
                    }
                }
            }
        }
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                if(map.containsKey(targets[i].charAt(j))){
                    answer[i] = answer[i]+map.get(targets[i].charAt(j));
                } else{
                    answer[i] = -1;
                    j = targets[i].length();
                }
            }
        }
        System.out.println(map);
        return answer;
    }
}