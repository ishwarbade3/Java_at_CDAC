package arrays;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[]ishwar) {
		Scanner kbd=new Scanner(System.in);
		System.out.print("Enter array Size : ");
		int size = kbd.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter array Element : ");
		for(int i=0;i<size;i++) {
			System.out.print("Enter array Element at index "+i+" : ");
			arr[i]=kbd.nextInt();	
			}
		System.out.println("Array Becomes : ");
		for(int a :arr) {
			System.out.print(a+" ");
		}
	
	}
}
