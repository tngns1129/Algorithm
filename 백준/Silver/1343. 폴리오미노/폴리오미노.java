import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String row = sc.nextLine();
        StringBuilder answer = new StringBuilder();
        int index = 0;

        for (int i = 0; i < row.length(); i++) {
            if (row.charAt(i) == 'X') {
                index++;
            } else {
                if (index % 2 == 1) {  // 홀수 개의 X가 나오면 불가능
                    System.out.println("-1");
                    return;
                }
                fill(answer, index);
                answer.append(".");  // X가 끝났으므로 . 추가
                index = 0;
            }
        }

        // 마지막 처리
        if (index % 2 == 1) {
            System.out.println("-1");
            return;
        }
        fill(answer, index);

        System.out.println(answer);
    }

    private static void fill(StringBuilder answer, int count) {
        while (count >= 4) {
            answer.append("AAAA");
            count -= 4;
        }
        if (count == 2) {
            answer.append("BB");
        }
    }
}