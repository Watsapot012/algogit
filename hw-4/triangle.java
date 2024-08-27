import java.util.Scanner;

    public class triangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the base of the triangle: ");
            int base = sc.nextInt();
            System.out.print("Enter the height of the triangle: ");
            int height = sc.nextInt();
            float triangle =(1f/2.0f)*base*height;
            System.out.println("Area of the triangle: "+triangle+" square units");
    System.out.println("-------------------------------------------");
    Scanner lengthSc = new Scanner(System.in);
    System.out.print("Enter the length of the square: ");
    float length = lengthSc.nextFloat();
    float squareArea=length*length;
    System.out.print("Area of the squareArea: "+squareArea+" square units");
        
        }
    }