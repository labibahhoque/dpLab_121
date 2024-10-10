import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Display beverage options and take input
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Please select a beverage:");
        System.out.println("1. Espresso ($2.00)");
        System.out.println("2. Latte ($3.00)");
        System.out.println("3. Cappuccino ($3.50)");
        System.out.print("Enter your choice (1-3): ");

        int beverageChoice = scanner.nextInt();
        Beverage beverage = null;

        switch (beverageChoice) {
            case 1:
                beverage = new Espresso(new Milk());
                break;
            case 2:
                beverage = new Latte();
                break;
            case 3:
                beverage = new Cappuccino();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Espresso.");
                beverage = new Espresso();
        }

        // Step 2: Display condiment options and take input
        boolean addingCondiments = true;

        while (addingCondiments) {
            System.out.println("\nWould you like to add a condiment?");
            System.out.println("1. Milk ($0.50)");
            System.out.println("2. Sugar ($0.20)");
            System.out.println("3. Whipped Cream ($0.70)");
            System.out.println("4. No more condiments");
            System.out.print("Enter your choice (1-4): ");

            int condimentChoice = scanner.nextInt();

            switch (condimentChoice) {
                case 1:
                    System.out.print("How many servings of Milk? ");
                    int milkAmount = scanner.nextInt();
                    for (int i = 0; i < milkAmount; i++) {
                        beverage = new Milk(beverage);
                    }
                    break;
                case 2:
                    System.out.print("How many servings of Sugar? ");
                    int sugarAmount = scanner.nextInt();
                    for (int i = 0; i < sugarAmount; i++) {
                        beverage = new Sugar(beverage);
                    }
                    break;
                case 3:
                    System.out.print("How many servings of Whipped Cream? ");
                    int whippedCreamAmount = scanner.nextInt();
                    for (int i = 0; i < whippedCreamAmount; i++) {
                        beverage = new WhippedCream(beverage);
                    }
                    break;
                case 4:
                    addingCondiments = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        // Step 3: Display the final beverage description and total cost
        System.out.println("\nYour order: " + beverage.getDescription());
        System.out.println("Total cost: $" + beverage.cost());

        scanner.close();
    }
}


