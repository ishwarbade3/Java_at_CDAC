import java.util.List;

public class Trainer {
	private static int No = 1;
	private int srNo;
	private String name;
	private int age;
	private char gender;
	private int exp_years;
	private boolean online;
	private List<String> tech_lang;

	public Trainer() {
	}

	public Trainer(String name, int age, char gender, int exp_years, boolean online, List<String> tech_lang) {
		this.srNo = No;
		this.No += 1;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.exp_years = exp_years;
		this.online = online;
		this.tech_lang = tech_lang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getExp_years() {
		return exp_years;
	}

	public void setExp_years(int exp_years) {
		this.exp_years = exp_years;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public List<String> getTech_lang() {
		return tech_lang;
	}

	public void setTech_lang(List<String> tech_lang) {
		this.tech_lang = tech_lang;
	}

	@Override
	public String toString() {
		return "Trainer [srNo : " + srNo + " name=" + name + ", age=" + age + ", gender=" + gender + ", exp_years="
				+ exp_years + ", online=" + online + ", tech_lang=" + tech_lang + "]";
	}

}
