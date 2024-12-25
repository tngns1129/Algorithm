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


        char chess[][] = new char[8][8];
        char input[][] = new char[row][col];

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=0; i<board.length; i++){
            input[i] = board[i].toCharArray();
        }

        for(int i=0; i< input.length-7; i++){
            for(int j=0; j<input[0].length-7; j++){
                for(int x=0; x<8; x++){
                    for(int y=0; y<8; y++){
                        chess[x][y] = input[i+x][j+y];
                    }
                }
                answer.add(numOfPaint(chess));
            }
        }

        int ans = answer.get(0);
        for(int i= 0; i<answer.size(); i++){
            if(answer.get(i) < ans){
                ans = answer.get(i);
            }
        }

        System.out.println(ans);
    }

    static int numOfPaint(char chess[][]){
        int a=0;
        char[][] nomalChess1 = {
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'}
        };

        for(int i=0; i< chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                if(chess[i][j] != nomalChess1[i][j]){
                    a++;
                }
            }
        }
        return Math.min(a, 64-a);
    }
}