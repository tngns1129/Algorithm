class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replace("ayaaya","x");
            babbling[i] = babbling[i].replace("yeye","x");
            babbling[i] = babbling[i].replace("woowoo","x");
            babbling[i] = babbling[i].replace("mama","x");
            babbling[i] = babbling[i].replace("aya"," ");
            babbling[i] = babbling[i].replace("ye"," ");
            babbling[i] = babbling[i].replace("woo"," ");
            babbling[i] = babbling[i].replace("ma"," ");
            babbling[i] = babbling[i].replace(" ","");
            if(babbling[i].equals("")){
                answer++;
            }
        }
        return answer;
    }
}