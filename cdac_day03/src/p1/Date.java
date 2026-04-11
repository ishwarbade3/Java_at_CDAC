package p1;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	public Date() {}
	public Date(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
//	public static void swapDate(Date d1,Date d2) {
//		Date temp;
//		temp=d1;
//		d1=d2;
//		d2=temp;
//	}
	public static void swapDate(Date [] d) {
		Date temp;
		temp = d[0];
		d[0]=d[1];
		d[1]=temp;
	}
	public static void main(String[]ishwar) {
		Date d1 =new Date(12,04,2026);
		Date d2 =new Date(04,04,2026);
		Date []d= new Date[2];
		d[0]=d1;
		d[1]=d2;
		System.out.println("Date Before d1: "+d[0]);
		System.out.println("Date Before d2: "+d[1]);
		Date.swapDate(d);
		System.out.println("Date After  d1: "+d[0]);
		System.out.println("Date After  d2: "+d[1]);
	} 
}
