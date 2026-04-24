package cdac_dsa01;

import java.util.Scanner;

public class Valid_Parenthesis {
	public static void main(String[] ishwar) {
		Scanner kbd = new Scanner(System.in);
		CharStack st = new CharStack();
		String str = "[{(2+3)gj+(10)+}}]";
		char ch;
		int i;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				st.push(str.charAt(i));
			} else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
				if (!st.isEmpty()) {
					ch = st.peek();
					if (ch == '(' && str.charAt(i) == ')' || ch == '[' && str.charAt(i) == ']'
							|| ch == '{' && str.charAt(i) == '}') {
						st.pop();
					} else {
						System.out.println("Not Valid patenthesis");
						break;
					}
				} else {
					System.out.println("Not Valid patenthesis");
					break;
				}
			}
		}
		if (st.isEmpty() && i == str.length()) {
			System.out.println("Valid Parenthesis !!!!!");

		}

		kbd.close();
	}

}
