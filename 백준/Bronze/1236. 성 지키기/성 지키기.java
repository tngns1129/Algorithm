import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row,col;
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        int rindex = 0, cindex = 0;
        int index = 0;
        
        
        char[][] castle = new char[row][col];
        
        for(int i = 0; i < row; i++){
            String a = br.readLine();
            for(int j = 0; j < col; j++){
                castle[i][j] = a.charAt(j);
            }
        }
        
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
               if(castle[i][j] == 'X'){
                   index++;
               } else{
                   
               }
               if(j == col - 1){
                   if(index == 0){
                       rindex++;
                   } else{index = 0;}
               }
            }
        }
        
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
               if(castle[j][i] == 'X'){
                   index++;
               } else{
                   
               }
               if(j == row - 1){
                   if(index == 0){
                       cindex++;
                   }else{
                       index = 0;
                   }
                   
               }
            }
        }
        
        if(rindex == cindex){
            System.out.println(rindex);
        } else if(rindex > cindex){
            System.out.println(rindex);
        } else if(rindex < cindex){
            System.out.println(cindex);
        }
        
    }
}