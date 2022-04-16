//Library Management System By Rupantar Chakraborty In C++ Language
#include<iostream>

int main()
{
//Here i have made the welcome screen design
std::cout<<"*********************************************************"<<std::endl;
std::cout<<"***************_Library_Management_System_***************"<<std::endl;
std::cout<<"*********************************************************\n\n"<<std::endl;
std::cout<<"*************************Welcome*************************"<<std::endl;
//Logging In or Exit option
std::cout<<"\n\n1. Log In"<<std::endl;
std::cout<<"2. Exit"<<std::endl;
int i, j, Username, Password;
char Admin;
std::cout<<"\n\nChoose the option : ";
std::cin>>i;
if (i==1)
{
    std::cout<<"\n\nEnter the Username : ";
    std::cin>>Username;
        if (Username == 1)
        {
            std::cout<<"Enter the Password : ";
            std::cin>>Password;
            if (Password == 1)
                {
                int w;
                std::cout<<"\n\nLogging in...."<<std::endl;               
                std::cout<<"1. Teacher"<<std::endl;
                std::cout<<"2. Student"<<std::endl;
                std::cout<<"3. Exit"<<std::endl;
                std::cout<<"\n\nChoose the option : ";
                std::cin>>w;
                    if (w==1)
                    {
                        std::cout<<"\n\nWelcome Teacher"<<std::endl;
                            {   int innerChoice = 0;
                            

                                std::cout << "\n1. Add new book";

                                std::cout << "\n2. Update any Book";

                                std::cout << "\n3. Delete Book";

                                std::cout << "\n4. List of all Books";

                                std::cout << "\n5. Exit\n\n";

                                std::cout << "Choose the option : ";

                                std::cin >> innerChoice;

                                int arr1[1000], b, elem;

                                switch (innerChoice)
                                    {

                                        case 1:
                                        for(b=0; b<999; b++);
                                           
                                        break;

                                        case 2:
                                       ;
                                        break;

                                        case 3:
                                        ;
                                        break;

                                        case 4:
                                       ;
                                        break;

                                        case 5:
                                        std::cout <<"\n\nLogging Out....";
                                        return 0;
                                        break;

                                        default:
                                        std::cout <<"\n\n Invalid Choice. Please enter the valid one";

                                        getchar ();
                                    } 


                            }
                    }
                    else if (w==2)
                    {
                        std::cout<<"Welcome Student"<<std::endl;
                    }
                    else
                    {
                    std::cout<<"Logging Out...."<<std::endl;    
                    }
                     
                }
            else
            std::cout<<"! Invalid_Password !";
            
        }
        else{
        std::cout<<"! Invalid_Username !";
        }   
}
else 
{
    return 0;
}
}