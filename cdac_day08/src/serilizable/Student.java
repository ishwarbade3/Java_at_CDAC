package serilizable;

import java.io.Serializable;

public class Student implements Serializable {
	private int rolNO;
	private String name;

	public Student(int rolNO, String name) {
		this.rolNO = rolNO;
		this.name = name;
	}

	@Override
	public String toString() {
		return rolNO + " " + name;
	}

}
