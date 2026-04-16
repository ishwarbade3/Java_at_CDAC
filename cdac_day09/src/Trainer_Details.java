
import java.util.Arrays;
import java.util.List;

public class Trainer_Details {
	public static List<Trainer> addData(){
		Trainer t1 = new Trainer("Ishwar", 21, 'M', 1, false,Arrays.asList("c","c++","Java") );
		Trainer t2 = new Trainer("Siddhart", 23, 'M', 10, true,Arrays.asList("CSS","HTML","Java") );
		Trainer t3 = new Trainer("Sagar", 29, 'M', 15, false,Arrays.asList("DSA","JS","JS") );
		Trainer t4 = new Trainer("Digu", 37, 'M', 20, true,Arrays.asList("AWS","Asure","Oracle") );
		Trainer t5 = new Trainer("Swati", 31, 'F', 9, true,Arrays.asList("JS","Docker","Kubernates") );
		Trainer t6 = new Trainer("Shrayu", 57, 'F', 27, false,Arrays.asList("c","c++","Java") );
		Trainer t7 = new Trainer("Mansi", 29, 'F', 7, true,Arrays.asList("AWS","JAVA","FullStack") );
		List<Trainer> l = Arrays.asList(t1,t2,t3,t4,t5,t6,t7);
		return l;
	}

}
