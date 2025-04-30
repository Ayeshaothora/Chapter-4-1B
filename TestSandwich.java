import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for sandwich details
        System.out.print("Enter the main ingredient of the sandwich: ");
        String mainIngredient = scanner.nextLine();

        System.out.print("Enter the type of bread: ");
        String breadType = scanner.nextLine();

        System.out.print("Enter the price of the sandwich: ");
        double price = scanner.nextDouble();

        // Create and set Sandwich object
        Sandwich sandwich = new Sandwich();
        sandwich.setMainIngredient(mainIngredient);
        sandwich.setBreadType(breadType);
        sandwich.setPrice(price);

        // Display sandwich information
        System.out.println("\n--- Sandwich Details ---");
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getBreadType());
        System.out.println("Price: $" + sandwich.getPrice());

        scanner.close();
    }
}
