class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] powerArr = new int [number];
        for(int i = 1; i <= number; i++){
            powerArr[i-1] = num(i);
        }
        for(int i = 0; i < powerArr.length; i++){
            System.out.println(powerArr[i]);
        }
        
        for(int i = 0; i < powerArr.length; i++){
            if(powerArr[i] > limit){
                powerArr[i] = power;
            }
        }
        for(int i = 0; i < powerArr.length; i++){
            answer += powerArr[i];
        }
        return answer;
    }
    public int num(int number){
        int n=0;
        for(int i = 1; i * i <= number; i++){
            if(i*i == number){
                n++;
            } else if(number % i == 0){
                n+=2;
            }
        }
        return n;
    }
}