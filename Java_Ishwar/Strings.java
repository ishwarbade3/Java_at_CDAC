import java.util.*;

public class Strings {
    // Strings Are Immutable 
    public static void main(String[] args) {
        System.err.println("Hi Ishwar How Ara You ");
        String fn="Ishwar";
        String ln="Bade";
        String an= fn+" "+ln;
        System.out.println(an);
        System.out.println("Length of String is : "+an.length());

        for(int i = 0;i< an.length();i++){
            System.out.print(an.charAt(i) +"  ");
        }
        String fn1="Ishwar";

        if(fn.compareTo (ln)==0){
            System.out.println("\nBoth Strings are Same");
        }
        else{
             System.out.println("\nBoth Strings are Not Same");
        }
        if(new String("Ishwar")== new String("Ishwar")){
            System.out.println("Both Strings are Same");
        }
        else{
             System.out.println("Both Strings are Not Same");
        }
        String Sentence= "My name is Ishwar";

        String Name= Sentence.substring(Sentence.length()-6);
        System.out.println("Name using SubString : "+Name);
    }
}
 