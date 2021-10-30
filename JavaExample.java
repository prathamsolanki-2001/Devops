import java.util.Scanner;
public class JavaExample {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Enter the marks of first subject: ");
        String num11 = System.getenv("a");
        int num1 = Integer.parseInt(num11);
        //System.out.print("Enter the marks of second subject: ");
        String num22 = System.getenv("b");
        int num1 = Integer.parseInt(num11);
        //System.out.print("Enter the marks of third subject: ");
        String num33 = System.getenv("c");
        int num1 = Integer.parseInt(num11);
        scan.close();
        System.out.print("The average of entered marks is:" + avr(num1, num2, num3) );
    }

  public static double avr(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}
