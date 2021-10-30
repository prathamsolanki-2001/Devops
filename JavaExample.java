import java.util.Scanner;
public class JavaExample {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Enter the marks of first subject: ");
        double num1 = System.getenv("num1");
        System.out.print("Enter the marks of second subject: ");
        double num2 = System.getenv("num2");
        System.out.print("Enter the marks of third subject: ");
        double num3 = System.getenv("num3");
        scan.close();
        System.out.print("The average of entered marks is:" + avr(num1, num2, num3) );
    }

  public static double avr(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}
