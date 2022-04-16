import java.util.Scanner;
public class switchcase {
 
    public static void main(String args[]){
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch(ch) //Checking Vowel Character using Switch Case
    {
        case 'a','e','i', 'o', 'u','A','E','I','O','U': 
        System.out.println(ch+" is a Vowel.");
        break;

        default: 
        System.out.println(ch+" is a Non-Vowel Character.");
    }
    }   
}
