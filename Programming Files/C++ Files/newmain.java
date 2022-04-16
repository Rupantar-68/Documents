import java.util.Scanner;
public class newmain {
    public static void main(String[] args) throws Exception{
                Scanner sc=new Scanner(System.in);
                int id=123456789;
                int pin= 9991;
                String sacc="yes";
                String cacc="no";
                double sbal=50000;
                double cbal=0;
                int p;
                do{
                    p=0;
                    System.out.println("Insert the card");
                    int card=sc.nextInt();
                    if(id!=card){
                        System.out.println("Insert the card properly");
                        p++;
                    }
                }while(p!=0);
                System.out.println("1.Pin generation.\n2.Enter pin.");
                int x=sc.nextInt();
                switch(x){
                    case 1:
                        int otp=2345;
                        int attempt=0;
                        do{
                        System.out.println("Enter the otp received in your registered ph no.");
                        int y=sc.nextInt();

                            if(y==otp){
                                System.out.println("Enter new pin :");
                                int newpin=sc.nextInt();
                                pin= newpin;
                                System.out.println("Pin changed Successfully");
                                attempt=3;
                            }
                            else{
                                attempt++;
                                if (attempt==3)
                                    System.out.println("Your card is blocked.Please contact to bank.");
                            }
                        }while(attempt!=3);

                        break;
                    case 2:


                    System.out.println("Enter the pin: ");
                    int y=sc.nextInt();


                    if(pin!=y){
                       System.out.println("wrong pin");
                    }
                    else{
                        System.out.println("1.Savings.\n2.Current.");
                        int type=sc.nextInt();
                        switch(type){
                            case 1:

                                if(sacc == "yes"){
                                    System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance.");
                                    int s=sc.nextInt();
                                    switch(s){
                                        case 1:
                                            System.out.println("Enter the diposit amount:");
                                            double dip=sc.nextDouble();

                                            double finalbalance=sbal+dip;
                                            System.out.println("Your Current balance is : " +finalbalance);
                                            sbal=finalbalance;
                                            break;
                                        case 2:
                                            System.out.println("Enter the withdrawl amount:");
                                            double with=sc.nextDouble();
                                            if(with<=sbal){
                                            finalbalance=sbal-with;
                                            System.out.println("Your Current balance is : "+finalbalance);
                                            sbal=finalbalance;
                                            }
                                            else
                                                System.out.println("Insufficient balance.");
                                            break;
                                        case 3:
                                            System.out.println("Your current balance is : "+sbal);
                                            
                                            break;
                                        default:
                                            System.out.println("Invalid choice.");
                                    }
                                }
                                else
                                    System.out.println("You have no Savings Account.");
                                break;
                            case 2:
                                if(cacc=="yes"){
                                    System.out.println("1.Diposit\n2.Widraw\n3.Check Balance.");
                                    int c=sc.nextInt();
                                    switch(c){
                                        case 1:
                                            System.out.println("Enter the diposit amount:");
                                            double dip=sc.nextDouble();

                                            double finalbalance=cbal+dip;
                                            System.out.println("Your Current balance is : "+finalbalance);
                                            cbal=finalbalance;
                                            break;
                                        case 2:
                                            System.out.println("Enter the withdrawl amount:");
                                            double with=sc.nextDouble();
                                            if(with<=cbal){
                                            finalbalance=cbal-with;
                                            System.out.println("Your Current balance is : "+finalbalance);
                                            cbal=finalbalance;
                                            }
                                            else
                                                System.out.println("Insufficient balance.");
                                            break;
                                        case 3:
                                            System.out.println("Your current balance is : "+cbal);
                                        default:
                                            System.out.println("Invalid choice.");
                                    }
                                }
                                else
                                    System.out.println("You have no Current Account.");
                                break;
                        }
                    }
                }
//                System.out.println("our new pin is : "+pin);
        }

    }