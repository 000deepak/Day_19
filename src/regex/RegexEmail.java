package regex;
/*
* Program to to register a user  using regex patterns.
*
* */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class RegexEmail {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            //String pattern to be detected
            String match = "^(abc)+[0-9a-z_+-.]*@bridgelabz\\.co\\.[a-z]{2}$";

            //Checking for matches
            while(true) {

                // String to be scanned to find the pattern.
                System.out.print("Please enter your Email: ");
                String line = sc.nextLine();

                //Condition check
                boolean check=line.matches(match);
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

