import java.util.Scanner;

public class CircleArea {
  public static void main(String[] args) {
      final double pi = 3.14159;
      System.out.print("Enter radius ");
      Scanner scanner = new Scanner(System.in);
      
      float radius = scanner.nextFloat();
      final double area = (pi*radius*radius) ;
    System.out.println("Area of circle that has radius = "+radius+" meters is "+area+" square meters " );
  }   
}