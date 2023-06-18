class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        myStr = myStr.replaceAll(" {2,}"," ");
        if(myStr.charAt(0) == ' '){
            myStr = myStr.replaceFirst(" ","");
        }
        answer = myStr.split(" ");
        if(answer.length == 1 && answer[0].equals("")){
            answer[0] = "EMPTY";
        }
        return answer;
    }
}