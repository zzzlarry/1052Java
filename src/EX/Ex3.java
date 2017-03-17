package EX;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int arr[][] = new int[5][3];
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j <= 3; j++) {
				arr[i][j] = a;
				j++;
				int b = a / 3;
			}
		}

	}
}
