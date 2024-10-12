public class Main {

    public static void main(String[] args) {

        Product laptop = new Laptop();
        Product phone = new Phone();


        TechBundle techBundle = new TechBundle();
        HolidayBundle holidayBundle = new HolidayBundle();
        MegaBundle megaBundle = new MegaBundle(techBundle,holidayBundle);


        Product[] cartItems = {  techBundle , laptop, phone ,megaBundle };


        System.out.println("Your cart:");
        double totalPrice = 0;
        for (Product item : cartItems) {
            item.displayProductInfo();
            totalPrice += item.getPrice();
        }


        System.out.println("\nTotal Price: $" + totalPrice);
    }
}
