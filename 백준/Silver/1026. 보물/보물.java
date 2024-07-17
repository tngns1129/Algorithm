import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] A = new int[num];
        int[] B = new int[num];
        int[] C = new int[num];
        List list = new ArrayList<Integer>();
        int max = 0, index = 0, sum=0;

        for(int i=0; i<num; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<num; i++){
            B[i] = sc.nextInt();
        }

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(A[i] < A[j]){
                    index = A[i];
                    A[i] = A[j];
                    A[j] = index;
                }
            }
        }
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(B[i] > B[j]){
                    index = B[i];
                    B[i] = B[j];
                    B[j] = index;
                }
            }
        }
        for(int i=0; i<num; i++){
            sum = sum+ A[i]*B[i];
        }

        System.out.println(sum);
    }
}