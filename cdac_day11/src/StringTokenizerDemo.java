

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String str = "Mayuri=Java;"+"Saleel=MySql;";
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str, "=;");
		while(st.hasMoreTokens()) {
		String c= st.nextToken();
		String nm = st.nextToken();
//		String c1= st.nextToken();
//		String nm1 = st.nextToken();
		System.out.println(c+" --> "+nm);
		//System.out.println(c1+" --> "+nm1);
		}
		
	}

}
