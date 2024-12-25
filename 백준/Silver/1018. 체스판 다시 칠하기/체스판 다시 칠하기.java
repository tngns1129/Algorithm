import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        String board[] = new String[row];
        for(int i=0; i< board.length; i++){
            board[i] = sc.nextLine();
        }
        char input[][] = new char[row][col];
        int answer=64;
        int fixNum=0;

        for(int i=0; i<board.length; i++){
            input[i] = board[i].toCharArray();
        }

        for(int i=0; i< input.length-7; i++){
            for(int j=0; j<input[0].length-7; j++){
                for(int x=0; x<8; x++){
                    for(int y=0; y<8; y++){
                        if((x+y)%2 == 0){
                            if(input[i+x][j+y] == 'W'){
                                fixNum++;
                            }
                        }else{
                            if(input[i+x][j+y] == 'B'){
                                fixNum++;
                            }
                        }
                    }
                }
                if(answer>Math.min(fixNum,64-fixNum)){
                    answer = Math.min(fixNum,64-fixNum);
                }
                fixNum=0;
            }
        }
        System.out.println(answer);
    }
}