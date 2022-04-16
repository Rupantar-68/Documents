import java.util.Scanner;
public class numberreverse {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a 5 digit number : ");
        int number=obj.nextInt();
        int reverse=0;
        while(number!=0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number/=10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
