import java.util.Scanner;

public class TestClass5026211118
{
    public static Scanner sc;                                                           // Declaring scanner that can be accessed anywhere
    public static ComputeMethods5026211118 cm;                                          // Declaring compute methods that can be accessed anywhere
    public static void main (String[] args)
    {
        // Setting up scanner and compute methods
        sc = new Scanner(System.in);
        cm = new ComputeMethods5026211118();

        // Calling each feature
        fToc();
        hypotenuse();
        roll();
    }

    // Declaring methods so the features can be accessible anytime and for how many times we like
    public static void fToc()
    {
        System.out.println("----------[Fahrenheit To Celcius]----------");
        System.out.print("Input Fahrenheit degree(s) : ");
        double celcius = cm.fToc(sc.nextDouble());                                      // Capture input and then call fToc from computemethods
        sc.nextLine();                                                                  // Capture new line
        System.out.println("Temp in celcius is " + celcius);
    }

    public static void hypotenuse()
    {
        System.out.println("---------------[Hypotenuse ]---------------");
        System.out.print("Input length of side a : ");
        int a = sc.nextInt();
        System.out.print("Input length of side b : ");
        int b = sc.nextInt();
        double hypotenuse = cm.hypotenuse(a, b);                                        // Capture input and then call fToc from computemethods
        sc.nextLine();                                                                  // Capture new line
        System.out.println("Hypotenuse is " + hypotenuse);
    }

    public static void roll()
    {
        System.out.println("----------------[Dice Roll]----------------");
        System.out.println("The sum of the dice values is " + cm.roll());               // Output dice sum from the cm.roll()
    }
}