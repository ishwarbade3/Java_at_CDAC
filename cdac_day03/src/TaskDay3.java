import java.util.Scanner;

public class TaskDay3 {
	public static void main(String[] ishwar) {
		Scanner kbd = new Scanner(System.in);
		/*
		 * int y; int x =1; y = x++ + ++x; System.out.println(x + "  " + y);
		 * 
		 * int z; // x = y = 20; z = x++ - --y - --x + x++; // 10 20 19 20 20
		 * System.out.println(x + "  " + y + "  " + z); // z = 10; boolean x,y,z;
		 * x=false; y=true; z = ((x && y) || !(x || y)); System.out.println(x + "  " + y
		 * + "  " + z);
		 * 
		 * System.out.print("Enter the Salary : "); float empSalary = kbd.nextFloat();
		 * float HRA; float DA;
		 * 
		 * if(empSalary <= 1500) { HRA = empSalary * 0.1f; DA = empSalary * 0.9f;
		 * System.out.print("Gross Salary of Employee :  "+(empSalary+HRA+DA)); } else {
		 * HRA = empSalary + 500; DA = empSalary * 0.98f;
		 * System.out.print("Gross Salary of Employee :  "+(empSalary+HRA+DA)); }
		 * 
		 * System.out.print("Enter array Size : "); int size = kbd.nextInt(); int []
		 * arr=new int[size]; System.out.println("Enter array Element : "); for(int
		 * i=0;i<size;i++) { System.out.print("Enter array Element at index "+i+" : ");
		 * arr[i]=kbd.nextInt(); } int sum=0; System.out.println("Array Becomes : ");
		 * for(int a :arr) { System.out.print(a+" "); sum+=a; } System.out.println();
		 * System.out.println("Array Sum     : "+sum);
		 * System.out.println("Array Average : "+(float)sum/arr.length);
		 * 
		 * System.out.print("Enter array Size : "); int size = kbd.nextInt(); int[] arr1
		 * = new int[size]; System.out.println("Enter array Element : "); for (int i =
		 * 0; i < size; i++) { System.out.print("Enter array Element at index " + i +
		 * " : "); arr1[i] = kbd.nextInt(); } System.out.print("Array Becomes : "); for
		 * (int i = 0; i < size-1; i++) { for (int j = i+1; j < size; j++) { if (arr1[i]
		 * < arr1[j]) { int temp = arr1[i]; arr1[i] = arr1[j]; arr1[j] = temp; } } } for
		 * (int a : arr1) { System.out.print(a + " "); }
		 * 
		 * 
		 * int[][] arr = new int[5][]; System.out.println("Enter array Element : "); int
		 * counter = 0; int colSize; for (int i = 0; i < 5; i++) {
		 * 
		 * int remaining = 17 - counter; if (i == 4) { colSize = remaining;
		 * System.out.println("Row " + i + " will have " + colSize +
		 * " elements (auto-filled to reach 17)"); } else { while (true) {
		 * System.out.print("Enter column size for row " + i + " (max " + remaining +
		 * "): "); colSize = kbd.nextInt();
		 * 
		 * if (colSize > 0 && colSize <= remaining - (4 - i)) { break; } else {
		 * System.out.println("Invalid! Ensure total elements = 17."); } } } arr[i] =
		 * new int[colSize]; counter += colSize; for (int j = 0; j < colSize; j++) {
		 * System.out.print("Enter array Element at index [" + i + "] [" + j + "] : ");
		 * arr[i][j] = kbd.nextInt(); } } System.out.println("Array Becomes : "); for
		 * (int a[] : arr) { System.out.println(); for (int i : a) { System.out.print(i
		 * + " "); } }
		 * 
		 * 
		 * int[][] arr1 = new int[3][3];
		 * System.out.println("Enter array Element for arr1 : "); for (int i = 0; i < 3;
		 * i++) { for (int j = 0; j < 3; j++) {
		 * System.out.print("Enter array Element at index [" + i + "] [" + j + "] : ");
		 * arr1[i][j] = kbd.nextInt(); } }
		 * 
		 * int[][] arr2 = new int[3][3];
		 * System.out.println("Enter array Element for arr2 : "); for (int i = 0; i < 3;
		 * i++) { for (int j = 0; j < 3; j++) {
		 * System.out.print("Enter array Element at index [" + i + "] [" + j + "] : ");
		 * arr1[i][j] = kbd.nextInt(); } } int[][] arr3 = new int[3][3];
		 * 
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) { for(int
		 * k=0;k<3;k++) { arr3[i][j]+= arr1[i][k] * arr1[k][j]; } } }
		 * 
		 * for(int i[]:arr3) { System.out.println(); for(int a :i) {
		 * System.out.print("  "+a); } }
		 * 
		 * 
		 * System.out.print("Enter array Size : "); int size = kbd.nextInt(); int [][]
		 * arr=new int[size]; System.out.println("Enter array Element : "); for(int
		 * i=0;i<size;i++) { System.out.print("Enter array Element at index "+i+" : ");
		 * arr[i]=kbd.nextInt(); } System.out.println("Array Becomes : "); for(int a
		 * :arr) { System.out.print(a+" "); }
		 */
		kbd.close();
	}
}
