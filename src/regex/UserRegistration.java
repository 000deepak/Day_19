package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*@welcome-User registration program is application for taking valid user inputs according to given conddition
 * @author-deepak
 * @since-20/10/21
 *
 */
public class UserRegistration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String pattern to be detected
        String fname_match = "[A-Z]{1}[a-zA-Z]{2,}";
        String lname_match = fname_match;
        String email_match = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        String phone_match = "[0-9]{1,}\\s[1-9]{1}[0-9]{9}";
        String pass_match = "((?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])).{8,}";

        String firstname;
        String lastname;
        String email;
        String phone;
        String pass;

        /*Checking for matches*/
        while (true) {
            //UC1_Entering firstname
            System.out.print("Please enter your First Name: ");
            firstname = sc.nextLine();

            boolean check = firstname.matches(fname_match);                      //Condition check
            if (check) {
                break;
            } else {
                System.out.println("Incorrect format. Please try again.");
                System.out.println();
            }
        }

        //UC2_Entering lastname
        while (true) {

            System.out.print("Please enter your Last Name: ");
            lastname = sc.nextLine();

            boolean check = lastname.matches(lname_match);                        //Condition check
            if (check) {
                break;
            } else {
                System.out.println("Incorrect format. Please try again.");
                System.out.println();
            }
        }
        //UC3_Entering email
        while (true) {

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

        //UC4_Entering Phone details
        while (true) {

            System.out.print("Please enter your Mobile Phone No: ");
            phone = sc.nextLine();

            boolean check = phone.matches(phone_match);                            //Condition check
            if (check) {
                break;
            } else {
                System.out.println("Incorrect format. Please try again.");
                System.out.println();
            }
        }

        //UC5-UC9_Entering password
        while (true) {

            System.out.print("Please enter your password: ");
            pass = sc.nextLine();

            boolean check = pass.matches(pass_match);                               //Condition check
            if (check) {
                break;
            } else {
                System.out.println("Incorrect format. Please try again.");
                System.out.println();
            }
        }

        System.out.println("Welcome " + firstname + " " + lastname);
        System.out.println("You Email ID is " + email);
        System.out.println("You Mobile Phone No. is +" + phone);
        System.out.println("You Password is [Redacted]");
        System.out.println("Program End.");

    }
}
