package code;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Emailvalidation {
	public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 return matcher.matches();

		 }
		 public static void main(String[] args) {
		 List<String> emails = new ArrayList<String>();
		 // valid email addresses
		 emails.add("prajakta@gmail.com");
		 emails.add("praju9b@yahoo.com");
		 emails.add("john126@rao.me.org");
		 //invalid email addresses
		 emails.add("sita.gmail.com");
		 emails.add("rita@..bob@yahoo.com");
		 emails.add("nita@.gmail.com");
		 for (String value : emails) {
		 System.out.println("The aEmail address " + value + " is " + (isValidEmail(value) ? "valid" :
		"invalid"));
		 }

		 System.out.println("Enter any email address to check");
		 Scanner sc = new Scanner(System.in);
		 String input = sc.nextLine();
		 System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" :
		"invalid"));

		 }

		}