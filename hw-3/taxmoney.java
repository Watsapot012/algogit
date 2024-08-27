import java.util.Scanner;

public class taxmoney {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.print("Enter money : ");
        short taxmoney = money.nextShort();
        int dollar = (10*taxmoney)/100 ;
        int Sum =Math.round(dollar);
        System.out.println(taxmoney+" money is tax "+Sum);
        money.close();      
    }
    
}
