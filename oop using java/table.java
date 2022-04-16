import java.util.Scanner;
public class table {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int a=sc.nextInt();
            int i=1;
            while (i<=10){
                int result=a*(i);
                System.out.println(result);
                i++;
            }
        }
}