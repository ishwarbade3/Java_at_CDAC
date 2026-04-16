import java.util.Vector;

public class Assignment_Vector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(5,5);
		for(int i = 1 ; i <= 15;i++) {
			v.add(i);
		}
		System.out.println(v);
		v.add(50);
		v.add(23);
		System.out.println(v);
		for(int i = 0 ; i < 5;i++) {
			v.remove(i);
		}
		System.out.println(v);
		Vector<Integer> v1 = new Vector<Integer>(5,5);
		v1.add(10);
		v1.add(11);
		v1.add(13);
		v1.add(12);
		v1.add(14);
		v1.add(15);
		v1.add(16);
		v1.add(17);
		v1.add(18);
		System.out.println(v1);
		for(int i = 0 ; i < 2;i++) {
			v1.remove(i);
		}
		System.out.println(v1);
		
		
	}

}
