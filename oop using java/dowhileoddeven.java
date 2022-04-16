import java.util.Scanner;
public class dowhileoddeven {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number : ");
        int number=obj.nextInt();
        int evenSum = 0,oddSum=0,i=0;
        do{
            if(i%2==0) {
                evenSum = evenSum + i;
            }
            else {
                oddSum = oddSum + i;
            }
            i++;
        }while(i<=number);
        System.out.println("Sum of all odd numbers are: "+oddSum);
        System.out.println("Sum of all even numbers are: "+evenSum);
    }
}
