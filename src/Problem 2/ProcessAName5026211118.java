import java.util.Scanner;

public class ProcessAName5026211118 {
    public static Scanner sc;          
    public static void main (String[] args)
    {
        // Setting up scanner and compute methods
        sc = new Scanner(System.in);

        // Get full nome from user input
        System.out.print("Type your name : ");
        String fullName = sc.nextLine();
        System.out.println("Your name is " + manipulateName(fullName));
    }

    public static String manipulateName(String fullName)
    {
        // We assume the fullname format is { fullname surname }
        // This method is only used for names with the format as above
        String initial = fullName.substring(0, 1);                                          // Getting initial by getting the first letter (from 0 to 1)
        String lastName = fullName.substring(fullName.indexOf(' ')+1);                      // Getting lastname by substring from the index of char space + 1 ( excluding the space char ), and this will return the rest of string from the index of char space + 1
        return lastName + ", " + initial;                                                   // Returning name with format of Surname, Initial
    }
}