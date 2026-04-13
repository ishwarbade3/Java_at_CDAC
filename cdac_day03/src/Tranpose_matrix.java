import java.util.Scanner;

public class Tranpose_matrix {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int arr[][] = new int[2][3];
		System.out.println("Enter the Array element ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = kbd.nextInt();
			}
		}
		int transpose[][] = new int[3][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[j][i] = arr[i][j];
			}
		}

		System.out.println("Your array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose array");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

		kbd.close();

	}

}
