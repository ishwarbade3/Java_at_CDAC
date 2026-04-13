package assignment.processor;

public abstract class Processor {
	private String data;

	public Processor() {
		data = "12/04/2003";
	}

	public void showData() {
		System.out.println("Data  : " + data);
	}

	public abstract void process(float num);

}
