import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int index = k;
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[n];


        for(int i=1; i<=n; i++){
            list.add(i);
        }

        for(int i=0; i<n; i++){
            while(k>list.size()){
                k = k-list.size();
            }
            answer[i] = list.get(k-1);
            list.remove(k-1);
            k = k+index-1;
        }
        System.out.print("<");
        for(int i=0; i< answer.length; i++){
            System.out.print(answer[i]);
            if(i != answer.length-1){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}