import java.util.Scanner;

public class Hypotenues{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the  side 1:");
    double x = sc.nextDouble();
    
    System.out.println("Enter the  side 2:");
    double y = sc.nextDouble();

    sc.close();
    
    x= Math.pow(x,2);
    y= Math.pow(y,2);


    Double z = Math.sqrt(x + y);
    System.out.println("Side 3 is : "+z);
}
}