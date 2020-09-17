import java.awt.*;
import java.util.Scanner;
import java.text.NumberFormat;

public class HelloWorld {

        public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);    
   
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        //double principal = 100000;
        System.out.println(principal);
        
        System.out.print("Annual Interest: ");
        double interest = scanner.nextDouble();
        //double interest = 3.92;
        System.out.println(interest);
        
        System.out.print("Period in years: ");
        double years = scanner.nextDouble();
        //double years = 30;
        System.out.println(years);

        double p = principal;
        double i = (interest/100)/12;
        double t = years*12;

        double mortgage = p*((i*(Math.pow(1+i,t)))/(Math.pow(1+i,t)-1));

        System.out.println("Your monthly payment based on these values is: "+String.format("%.2f",mortgage));
                
    }
}