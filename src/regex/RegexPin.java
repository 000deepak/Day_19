package regex;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPin {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String match = "[1-9]{1}[0-9]{2}(\\s)?[0-9]{3}";			//String pattern to be detected

        //Checking for matches
        while(true) {

            // String to be scanned to find the pattern.
            System.out.print("Please enter PIN Code: ");
            String line = sc.nextLine();

            boolean check=line.matches(match);							//Condition check
            if(check) {
                break;
            }else{
                System.out.println("Incorrect format. Please try again.");
                System.out.println();
            }
        }
        System.out.println("Program End.");
    }
}
