import java.util.Random;
public class ComputeMethods5026211118
{
    public double fToc(double degreesF)
    {
        return (degreesF-32.00)*5.00/9.00;                                      // The formula for converting ( F to C ) is the value of F - 32 times 5 divided by 9
    }

    public double hypotenuse(int a, int b)
    {
        return Math.sqrt((a*a)+(b*b));                                          // Hypotenuse is square root of the sum of a square and b square
    }

    public int roll()
    {
        Random rnd = new Random();                                              // Declaring rnd object
        return rnd.nextInt(7) + rnd.nextInt(7);                                 // 7 Because it's exclusive, so this code will return from 0 to 6
    }
}