import java.util.Scanner;



public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the java Dealership");
        System.out.println("- Select option 'a' to buy a car");
        System.out.println("- select option 'b' to sell a car");
        String option = scan.nextLine();
        
        switch (option) {
            case "a": 
                  System.out.println("What is your budget?");
                  int budget = scan.nextInt();
                  if(budget >= 10000) {
                    System.out.println("Great A Nissan Aultima is available");
                    System.out.println("\nDo you have insurance ? yes or no ");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a drivers license ? yes or no");
                    
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score ?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660  ) {
                        System.out.println("Sold Pleasure doing business with you");
                    } else {
                        System.out.println("We are sorry. You are not eligible");
                    }
                } else {
                    System.out.println(" Time for you to reexamine the budget");
                    
                  }

            
            break;
            case "b":
                 System.out.println("\nWhat is your car valued at ?");
                 int value = scan.nextInt();
                 System.out.println("\nWhat are you selling price");
                 int price = scan.nextInt();
                 if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you");
                 } else {
                    System.out.println("\nSorry. we're not interested!");
                 }
                 break;
            default: System.out.println("invalid option"); 
            scan.close();
        }
    }
}
