package cdac_day10;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

//	@Override
//	public int compare(Employee e1, Employee e2) {
//		if (e1.getEmpId() > e2.getEmpId())
//			return -1;
//		else if (e1.getEmpId() < e2.getEmpId())
//			return +1;
//		else
//			return 0;
//	}
	@Override
	public int compare(Employee e1, Employee e2) {

		/*
		 * int i = 0; while (i < e1.getEmpName().length() - 1 || i <
		 * e2.getEmpName().length() - 1) { if (e1.getEmpName().toLowerCase().charAt(i) <
		 * e2.getEmpName().toLowerCase().charAt(i)) { return -1; } else if
		 * (e1.getEmpName().toLowerCase().charAt(i) > e2.getEmpName().charAt(i)) {
		 * return +1; } else i++; } if (e1.getEmpName().toLowerCase().charAt(i) <
		 * e2.getEmpName().toLowerCase().charAt(i)) { return -1; } else if
		 * (e1.getEmpName().toLowerCase().charAt(i) >
		 * e2.getEmpName().toLowerCase().charAt(i)) { return +1; } else { if
		 * (e1.getEmpId() > e2.getEmpId()) { return +1; } else if (e1.getEmpId() >
		 * e2.getEmpId()) { return -1; } else { if (e1.getEmpSalary() >
		 * e2.getEmpSalary()) { return +1; } else if (e1.getEmpSalary() >
		 * e2.getEmpSalary()) { return -1; } else { return 0; } } }
		 */
		String s1 = e1.getEmpName();
	String s2 = e2.getEmpName();
		
		int i =   s1.compareTo(s2);
		if(i == 0)
		{
			return Integer.compare(e1.getEmpId(), e2.getEmpId());
		}
		return i;
		
		
		
	}

}
