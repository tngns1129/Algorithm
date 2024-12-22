import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String today = sc.nextLine();
        String todays[] = today.split(", ");
        String first[] = todays[0].split(" ");
        String second[] = todays[1].split(" ");
        String third[] = second[1].split(":");
        String month = first[0];
        String day = first[1];
        String year = second[0];
        String hour = third[0];
        String min = third[1];
        String maxDay = null;
        int pastDay;

        boolean isYounNyeon = false;
        if (Integer.parseInt(year) % 4 == 0) {
            if (Integer.parseInt(year) % 100 == 0) {
                if (Integer.parseInt(year) % 400 == 0) {
                    isYounNyeon = true;
                } else {
                    isYounNyeon = false;
                }
            } else {
                isYounNyeon = true;
            }
        }
        switch (month) {
            case "January":
                month = "1";
                maxDay = "31";
                break;
            case "February":
                month = "2";
                if (isYounNyeon) {
                    maxDay = "29";
                } else {
                    maxDay = "28";
                }

                break;
            case "March":
                month = "3";
                maxDay = "31";
                break;
            case "April":
                month = "4";
                maxDay = "30";
                break;
            case "May":
                month = "5";
                maxDay = "31";
                break;
            case "June":
                month = "6";
                maxDay = "30";
                break;
            case "July":
                month = "7";
                maxDay = "31";
                break;
            case "August":
                month = "8";
                maxDay = "31";
                break;
            case "September":
                month = "9";
                maxDay = "30";
                break;
            case "October":
                month = "10";
                maxDay = "31";
                break;
            case "November":
                month = "11";
                maxDay = "30";
                break;
            case "December":
                month = "12";
                maxDay = "31";
                break;
        }

        pastDay = 0;

        if (Integer.parseInt(month) == 1) {
            pastDay = Integer.parseInt(day)-1;

        } else {
            for (int i = 1; i < Integer.parseInt(month); i++) {
                if (i == 2) {
                    if (isYounNyeon) {
                        pastDay += 29;
                    } else {
                        pastDay += 28;
                    }
                } else if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    pastDay += 31;
                } else {
                    pastDay += 30;
                }
            }
            pastDay += Integer.parseInt(day);
        }

        // BigDecimal로 pastMin 계산
        BigDecimal pastDayMin = BigDecimal.valueOf(pastDay).multiply(BigDecimal.valueOf(1440));
        BigDecimal hourMin = BigDecimal.valueOf(Integer.parseInt(hour)).multiply(BigDecimal.valueOf(60));
        BigDecimal minute = BigDecimal.valueOf(Integer.parseInt(min));
        BigDecimal pastMin = pastDayMin.add(hourMin).add(minute);

        BigDecimal t = isYounNyeon ? new BigDecimal("527040") : new BigDecimal("525600");
        BigDecimal answer = pastMin.divide(t, 50, RoundingMode.HALF_UP);

//        System.out.println();
//        System.out.println(pastMin);
        System.out.println(answer.multiply(BigDecimal.valueOf(100)));
    }
}