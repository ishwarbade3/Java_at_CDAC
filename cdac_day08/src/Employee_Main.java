import java.util.ArrayList;
import java.util.Scanner;

public class Employee_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		ArrayList<Employee> emp = new ArrayList<Employee>();

		int ch;
		do {
			System.out.println("******CRUD Operation ***** \n1. Create\n2. Read\n3 Update\n4. Delete\n5. Exit");
			System.out.print("Enter Your Choice!!! \n  : ");
			ch = kbd.nextInt();

			switch (ch) {
			case 1: {
				Employee employee = new Employee();
				employee.addEmployee();
				emp.add(employee);
				break;
			}
			case 2: {
				if (emp.size() > 0) {
					for (Employee e : emp) {
						System.out.println(e);
					}
				} else {
					System.out.println("No Employee Present!!!!");
				}
				break;
			}
			case 3: {
				System.out.println("Enter Employee ID ");
				int id = kbd.nextInt();
				int flg = 0;
				for (int i = 0; i < emp.size(); i++) {

					if (emp.get(i).getEmpId() == id) {
						flg = 1;
						int count;
						do {
							System.out.println(
									"***What You Want To update \n1.Employee ID \n2. Employee Name\n3. Employee Salary \n4.Exit");
							System.out.println("Enter Your Choice  :  ");
							count = kbd.nextInt();
							switch (count) {
							case 1: {
								System.out.println("Enter Id To Change");
								int idd = kbd.nextInt();
								emp.get(i).setEmpId(idd);
								System.out.println("Id updated SucessFully!!!");
								break;
							}
							case 2: {
								System.out.println("Enter Name To Change");
								String nm = kbd.next();
								emp.get(i).setEmpName(nm);
								System.out.println("Id updated SucessFully!!!");
								break;
							}
							case 3: {
								System.out.println("Enter Id To Change");
								double sal = kbd.nextDouble();
								emp.get(i).setEmpSalary(sal);
								System.out.println("Id updated SucessFully!!!");
								break;
							}
							case 4:{
								System.out.println("E");
								break;
							}
							default: {
								System.out.println("Enter The Valid Choice!!!");
								break;
							}
							}

						} while (count != 4);
						break;

					}
				}

				if (flg == 0) {
					System.out.println("Employee Not Present in List");
				}

				break;

			}
			case 4: {
				System.out.println("Enter Employee Id to Delete");
				int id = kbd.nextInt();
				int flag = 0;
				for (int i = 0; i < emp.size(); i++) {
					if (emp.get(i).getEmpId() == id) {
						emp.remove(i);
						flag=1;
						System.out.println("Employee Deleted Sucessfully!!!!");
						break;
					}
				}
				if (flag == 0) {
					System.out.println("Employee Not present in List ");
				}
				break;
			}
			case 5 :{
				System.out.println("Exiting Sucessfully!!!!");
				break;
			}
			default: {
				System.out.println("Enter The Valid Choice!!!");
				break;
			}
			}

		} while (ch != 5);
		
//		System.out.println("Enter the ID to Search ");
//		int empid = kbd.nextInt();
//		int search=0;
//		for(int i =0 ;i< emp.size();i++) {
//			if(empid == emp.get(i).getEmpId()) {
//				System.out.println("Employee Present Detail As follow");
//				
//			}
			
//		}

	}
}
