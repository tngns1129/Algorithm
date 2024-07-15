import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numbers = new int[num];
        int[] asc = new int[num];

        int index1 = 0;
        int index2 = 0;

        for(int i=0; i<num; i++){
            numbers[i] = sc.nextInt();
            asc[i] = -1;
        }
        int min=1001;

        for(int j=0; j<num; j++){
            for(int i=0; i<num; i++){
                if(min > numbers[i] && asc[i] == -1){
                    min = numbers[i];
                    index1 = j;
                    index2 = i;
                }
            }
            asc[index2]=index1;
            min=1001;
        }
        for(int i=0; i<num; i++){
            System.out.print(asc[i]+" ");
        }
    }
}