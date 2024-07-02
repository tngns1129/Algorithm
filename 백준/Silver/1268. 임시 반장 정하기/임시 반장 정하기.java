import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int studentNum;
        studentNum = sc.nextInt();
        int[] students = new int[studentNum];
        int[][] one = new int[studentNum][5];
        for(int i=0; i<one.length; i++){
            for(int j = 0; j<5; j++){
                one[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<one.length; i++){
            for(int j=0; j<one.length; j++){
                if(i != j){
                    for(int x=0; x<5; x++) {
                        if (one[i][x] == one[j][x]) {
                            students[i] = students[i] + 1;
                            break;
                        }
                    }
                }
            }
        }

        int max = students[0];
        int index = 0;
        for(int i=0; i<studentNum; i++){
            if(max < students[i]){
                max = students[i];
                index = i;
            }
        }
        System.out.println(index+1);
    }
}