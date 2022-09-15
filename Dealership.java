import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch(option){
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();

                if(budget >= 10000){
                    System.out.println("Great! A Nissan Altima is available");

                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    String insurance = scan.next();

                    System.out.println("\nDo you have a driver license? Write 'yes' or 'no'");
                    String license = scan.next();

                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();

                    if(insurance.equals("yes") && license.equals("yes") && creditScore > 6600){
                        System.out.println("\nSold! Pleasure doing business with you");
                    }
                    else{
                        System.out.println("\nWe're sorry. You are not eligible");
                    }
                }
                else{
                    System.out.println("We don't sell cars under $10000. Sorry!");
                }
                break;
            case "b":
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();

                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if(price < value && price < 30000){
                    System.out.println("\nWe will buy a car. Pleasure doing business with you");
                }
                else{
                    System.out.println("\nSorry, we're not interested");
                }
                break;
            default:
                System.out.println("Invalid option");
        }

        scan.close();




    }
}
