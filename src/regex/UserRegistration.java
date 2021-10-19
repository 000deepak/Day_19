package regex;



import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String fname_match = "[A-Z]{1}[a-zA-Z]{2,}";			//String pattern to be detected
        String lname_match = fname_match;
        String email_match = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

        String firstname;
        String lastname;
        String email;



        //Checking for matches

        while(true) {
            //UC1_Entering firstname
            System.out.print("Please enter your First Name: ");
            firstname = sc.nextLine();

            boolean check=firstname.matches(fname_match);							//Condition check
            if(check) {
                break;
            }else{
                System.out.println("Incorrect format. Please try again.");
                System.out.println();
            }
        }

        while (true) {
            //Entering lastname
            System.out.print("Please enter your Last Name: ");
            lastname = sc.nextLine();

            boolean check = lastname.matches(lname_match);                            //Condition check
            if (check) {
                break;
            } else {
                System.out.println("Incorrect format. Please try again.");
                System.out.println();
            }
        } while (true) {
            //Entering email
            System.out.print("Please enter your Email ID: ");
            email = sc.nextLine();

            boolean check = email.matches(email_match);                            //Condition check
            if (check) {
                break;
            } else {
                System.out.println("Incorrect format. Please try again.");
                System.out.println();
            }
        }

        System.out.println("Welcome "+firstname+" "+lastname);
        System.out.println("You Email ID is " + email);

    }
}
