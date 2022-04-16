import java.util.Scanner;
public class datatype {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String user;
        System.out.println("Enter your name : ");
        user = obj.nextLine();
        System.out.println("Name is : " + user);

        int age;
        System.out.println("Enter your age : ");
        age = obj.nextInt();
        System.out.println("Age is : " + age);

        double salary;
        System.out.println("Enter your salary : ");
        salary = obj.nextDouble();
        System.out.println("Salary is : " + salary);

        float height;
        System.out.println("Enter your height : ");
        height = obj.nextFloat();
        System.out.println("Height is : " + height);
    }
}
