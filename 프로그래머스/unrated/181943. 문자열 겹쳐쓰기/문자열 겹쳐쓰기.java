class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int i;
        for(i=0; i<s; i++){
            answer = answer + (char)my_string.charAt(i);
        }
        for(i=s; i<s+overwrite_string.length(); i++){
            answer = answer + (char)overwrite_string.charAt(i-s);
        }
        if(my_string.length() > s+overwrite_string.length()-1){
            for(i=s+overwrite_string.length(); i<my_string.length(); i++){
                answer = answer + (char)my_string.charAt(i);
            }
        }
        return answer;
    }
}