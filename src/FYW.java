import java.util.Scanner;

class FYW {

    
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 5){
        System.out.println("================ Welcome to Find Your worker App!! ================\n");
        
        System.out.println("1- choose service \n");
        System.out.println("2- search for service \n");
        System.out.println("3- Register as a worker \n");
        System.out.println("4- contact support\n");
        System.out.println("5- exit\n");
        System.out.println("==================================================================\n");
        choice = sc.nextInt();
        
        
        
        switch (choice) {
            case 1:
                System.out.println("kindly choose a service:");
                System.out.println("1-Plumber\n2-Construction\n3-Electricity");
                int num = sc.nextInt();
               
                if(num == 1){
                    System.out.println("==================================================================");
                    System.out.println("Name               working hours               contact number");
                    System.out.println("==================================================================\n");
                    System.out.println("salem                8AM-12PM                    0505666342");
                    System.out.println("awad                 12PM-6PM                    0511643399");
                    System.out.println("mazen                6PM-12AM                    0522556945");
                    System.out.println("==================================================================\n");
                    
                }
                else if(num == 2){
                    
                    System.out.println("==================================================================");
                    System.out.println("Name                   working hours               contact number");
                    System.out.println("==================================================================\n");
                    System.out.println("Mohammed                8AM-12PM                    0505444342");
                    System.out.println("Ali                     12PM-6PM                    0511643399");
                    System.out.println("Ahmed                   6PM-12AM                    0522556945");
                    System.out.println("==================================================================\n");
                }
                
                 else if(num == 3){
                    
                    System.out.println("==================================================================");
                    System.out.println("Name                   working hours               contact number");
                    System.out.println("==================================================================\n");
                    System.out.println("Faris                   8AM-12PM                    0505444342");
                    System.out.println("Anas                    12PM-6PM                    0511643399");
                    System.out.println("Saif                    6PM-12AM                    0522556945");
                    System.out.println("==================================================================\n");
                }
                else
                     System.out.println("you entered a wrong number, try again.\n");
                break;

            case 2:
                System.out.println("Enter the service:\n");
                String service = sc.next().toLowerCase();
         
                if (customer.searchService(service) == true) {

                    System.out.println("the service is available\n");
                } else {
                    System.out.println("the service is not available\n");
                }
                break;
            case 3:
                System.out.println("Enter your name, phone number, job:\n");
                String name1 = sc.next();
                String phone1 = sc.next();
                String job1 = sc.next();
                Worker worker = new Worker(name1, phone1, job1);
                break;
            case 4:
                System.out.println("Thank you for reaching to us, your ticket number is " + SupportStaff.ContactCustomer() + " pleases contact us on the number (+966505333834) or email us (FYW_org@gmail.com)\n");
                break;
            case 5:
                System.out.println("Thank you for using our App, have a good day :)\n");
                break;

        }

    }

}
}