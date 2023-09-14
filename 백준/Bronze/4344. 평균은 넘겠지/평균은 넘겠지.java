import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int a;
		double num;
		double classes[] = new double[1000];
		double score[] = new double [1000];
		double avg,sum =0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		for(int i = 0; i < a; i++) {
			classes[i] = scan.nextDouble();
			num = 0;
			sum = 0;
			for(int j=0; j< classes[i]; j++) {
				score[j] = scan.nextDouble();
			}
			for(int j = 0; j < classes[i]; j++) {
				sum = sum + score[j];
			}
			avg = sum/classes[i];
			for(int j = 0; j < classes[i]; j++) {
				if(score[j] > avg)
					num++;
			}
			System.out.println(Math.round((num/classes[i]*100)*1000)/1000.0 + "%");
		}
	}
}
