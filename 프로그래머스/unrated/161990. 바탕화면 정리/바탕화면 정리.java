class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int [4];
        int lux, luy, rdx, rdy;
        lux = wallpaper.length;
        luy = wallpaper[0].length();
        rdx = 0;
        rdy = 0;
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    if(lux >= i){
                        lux = i;
                    }
                    if(luy >= j){
                        luy = j;
                    }
                    if(rdx <= i+1){
                        rdx = i+1;
                    }
                    if(rdy <= j+1){
                        rdy = j+1;
                    }
                }
            }
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        return answer;
    }
}