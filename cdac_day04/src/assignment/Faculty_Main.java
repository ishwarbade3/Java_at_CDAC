package assignment;

public class Faculty_Main {
	public static void main(String[] args) {

		Faculty f1 = new Full_Time_Faculty(112, "Varun", 30000, 2600);
		Full_Time_Faculty f2 = new Full_Time_Faculty(131, "Sheela", 32000, 2902.5f);

		Part_Time_Faculty p1 =new Part_Time_Faculty(361,"Machindra",160.56f,71.26f);
		Faculty p2 =new Part_Time_Faculty(361,"Kirtane",112.85f,49.5f);
		
		System.out.println("Using toString Method !!!! ");
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("Using Show Data Method  !!!!!!");
		
		f1.showData();
		f2.showData();
		p1.showData();
		p2.showData();

	}
}
