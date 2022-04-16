import java.util.Scanner;
public class calculator1 {
    public static int add (int num1, int num2) {
    int sum;
    sum=num1+num2;
    return sum;
}
public static void main (String[] args){
    Scanner obj=new Scanner (System. in) ;
    System.out.println ("Enter a number: ");
    int a=obj.nextInt () ;
    System.out.println ("Enter another number: ");
    int b=obj.nextInt ();
    int c=add(a, b) ;
    System.out.println ("The sum of a and b is: "+c);
    }
}