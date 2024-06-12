package exceptions;

import java.util.Scanner;

class CalcAverage {

	public double avgFirstN(int N) {

		double avg = 0;
		try {

			if (N <= 0) {
				throw new IllegalArgumentException("N should be a natural number greater than zero.");
			}

			int sum = 0;
			for (int i = 1; i <= N; i++) {
				sum = sum + i;

			}
			System.out.println(sum);

			avg = sum / N;

		} catch (IllegalArgumentException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		return avg;

	}
}

public class ThrowKeyword {
	public static void main(String[] args) {

		CalcAverage c = new CalcAverage();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		int n = sc.nextInt();
		double avg = c.avgFirstN(n);
		System.out.println(avg);
		
		sc.close();

	}

}
