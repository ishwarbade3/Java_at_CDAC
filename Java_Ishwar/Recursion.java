public class Recursion {
    public static void main(String[] args) {
        System.out.println("Good Morning Ishwar");
        // printnumber(10);
        // pn(10);
        // pnincreasing(1,5,0);
        // factorial(5, 1);
        // System.out.println(calFactorial(5));
        // int a=0,b=1,n=7;
        // System.out.print(a+" ");
        // System.out.print(b+" ");
        // fibonachiser(a, b, n-2);
        // System.out.println(calcpower(2, 5));
        // System.out.println(calcpowerlog(2, 5));
        // TowerofHanoi(4,"SRC","HELP","DEST");
        String s = "whojwcwbjwjcwvwko";
        String t="";
        // int len= s.length()-1;
        // System.out.println(len);
        // ReverseString(len, s);
        // ReverseString(s.length()-1, s);
        // FindOccurance(0, s, 'o');
        int a[] = { 1, 2, 3, 4, 5, 6, 6, 7, 8 };
        int b[] = { 5, 4, 4, 3, 1 };
        // System.out.println(isSortedASC(a, 0));
        // System.out.println(isSortedDESC(b, 0));
        moveAllCHLast(s, 0, 'w', 0, "");
        moveAllCHFirst(s, 0, 'w', 0, "");

    }

    public static void printnumber(int n) {
        System.out.println(n + " ");
        if (n > 1) {
            printnumber(n - 1);
        }
    }

    public static void pn(int num) {

        if (num < 0) {
            return;
        }
        System.out.println(num + " ");
        pn(num - 2);
    }

    public static void pnincreasing(int n, int num, int sum) {
        if (n > num) {
            System.out.println(sum);
            return;
        }
        sum += n;
        pnincreasing(n + 1, num, sum);
    }

    public static void factorial(int n, int total) {
        if (n == 1) {
            System.out.println(total);
            return;
        }
        total *= n;
        factorial(n - 1, total);
    }

    public static int calFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        // int factorial_n1 =calFactorial(n-1);
        // int fact = n * factorial_n1
        // return fact;
        return n * calFactorial(n - 1);
    }

    public static void fibonachiser(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonachiser(b, c, n - 1);
    }

    public static int calcpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // int Power1=calcpower(x, n-1);
        // return x*Power1;

        // int Power1=calcpower(x, n-1);
        // int xPower = x * Power1;
        // return xPower;

        return x * calcpower((x), n - 1);

    }

    public static int calcpowerlog(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcpowerlog(x, n / 2) * calcpowerlog(x, n / 2);
        } else {
            return (calcpowerlog(x, n / 2)) * (calcpowerlog(x, n / 2)) * x;
        }
    }

    public static void TowerofHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transfered Disk " + n + " From " + source + " to the " + destination);
            return;
        }
        TowerofHanoi(n - 1, source, destination, helper);
        System.out.println("Transfered Disk " + n + " From " + source + " to the " + destination);
        TowerofHanoi(n - 1, helper, source, destination);

    }

    public static void ReverseString(int index, String str) {
        if (index < 0) { // if we write condition index ==0 at that time we need tp print character at
                         // index 0
            // System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(index));
        ReverseString(index - 1, str);

    }

    public static int First = -1;
    public static int Last = -1;

    public static void FindOccurance(int index, String str, Character ch) {
        if (index == str.length()) {
            System.out.println("First Occurance at : " + First + " Last Occurance at : " + Last);
            return;
        }
        if (ch == str.charAt(index)) {
            if (First == -1) {
                First = index;
            } else {
                Last = index;
            }
        }
        FindOccurance(index + 1, str, ch);
    }

    public static boolean isSortedASC(int arr[], int index) { //
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return isSortedASC(arr, index + 1);
        } else {
            return false;
        }
    }

    public static boolean isSortedDESC(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return isSortedDESC(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void moveAllCHLast(String str, int index, char ch, int count, String newstr) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += ch;
            }
            System.out.println(newstr);
            return;
        }
        char curr = str.charAt(index);
        if (curr == ch) {
            moveAllCHLast(str, index + 1, ch, count + 1, newstr);
        } else {
            moveAllCHLast(str, index + 1, ch, count, newstr + curr);
        }
    }
     public static void moveAllCHFirst(String str, int index, char ch, int count, String newstr) {
        if (index == str.length()) {
            String cpy="";
            for (int i = 0; i < count; i++) {
                cpy+=ch;
            }
            System.out.println(cpy+newstr);
            return;
        }
        char curr = str.charAt(index);
        if (curr == ch) {
            moveAllCHFirst(str, index + 1, ch, count + 1, newstr);
        } else {
            moveAllCHFirst(str, index + 1, ch, count, newstr + curr);
        }
    }
}