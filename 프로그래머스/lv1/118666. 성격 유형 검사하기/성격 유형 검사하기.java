class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] mbti = new int [] {0,0,0,0,0,0,0,0};   // R T  C F  J M  A N
        for(int i = 0; i < survey.length; i++){
            if(survey[i].equals("RT") || survey[i].equals("TR")){
                if(choices[i] < 4){
                    if(survey[i].charAt(0) == 'R'){
                        mbti[0] += 4 - choices[i];
                    }else{
                        mbti[1] += 4 - choices[i];
                    }
                } else if(choices[i] > 4){
                    if(survey[i].charAt(0) == 'T'){
                        mbti[0] += choices[i] - 4;
                    }else{
                        mbti[1] += choices[i] - 4;
                    }
                }
            }
            
            if(survey[i].equals("CF") || survey[i].equals("FC")){
                if(choices[i] < 4){
                    if(survey[i].charAt(0) == 'C'){
                        mbti[2] += 4 - choices[i];
                    }else{
                        mbti[3] += 4 - choices[i];
                    }
                } else if(choices[i] > 4){
                    if(survey[i].charAt(0) == 'F'){
                        mbti[2] += choices[i] - 4;
                    }else{
                        mbti[3] += choices[i] - 4;
                    }
                }
            }
            
            if(survey[i].equals("JM") || survey[i].equals("MJ")){
                if(choices[i] < 4){
                    if(survey[i].charAt(0) == 'J'){
                        mbti[4] += 4 - choices[i];
                    }else{
                        mbti[5] += 4 - choices[i];
                    }
                } else if(choices[i] > 4){
                    if(survey[i].charAt(0) == 'M'){
                        mbti[4] += choices[i] - 4;
                    }else{
                        mbti[5] += choices[i] - 4;
                    }
                }
            }
            
            if(survey[i].equals("AN") || survey[i].equals("NA")){
                if(choices[i] < 4){
                    if(survey[i].charAt(0) == 'A'){
                        mbti[6] += 4 - choices[i];
                    }else{
                        mbti[7] += 4 - choices[i];
                    }
                } else if(choices[i] > 4){
                    if(survey[i].charAt(0) == 'N'){
                        mbti[6] += choices[i] - 4;
                    }else{
                        mbti[7] += choices[i] - 4;
                    }
                }
            }
        }
        if(mbti[0] >= mbti[1]){
            answer = answer + "R";
        } else{
            answer = answer + "T";
        }
        if(mbti[2] >= mbti[3]){
            answer = answer + "C";
        } else{
            answer = answer + "F";
        }
        if(mbti[4] >= mbti[5]){
            answer = answer + "J";
        } else{
            answer = answer + "M";
        }
        if(mbti[6] >= mbti[7]){
            answer = answer + "A";
        } else{
            answer = answer + "N";
        }
        return answer;
    }
}