
public class Person {
	private String personName;
	private int personAge;
	
	public Person(){
		personAge=18;
	}
	public Person(String personName, int personAge) {
		this.personName=personName;
		this.personAge=personAge;	
	}
	public void displayPerson()
	{
		System.out.println(" Name : "+personName+", Age : "+personAge);
	}
	public static void main(String[]ishwar) {
		Person p = new Person();
		p.displayPerson();
		Person p1 = new Person("Siddhart", 22);
		p1.displayPerson();
	}
}
