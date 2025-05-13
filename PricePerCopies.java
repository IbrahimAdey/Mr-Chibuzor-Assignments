public class PricePerCopies {

    public static void main(String[] args) {
        int copies = 75; 

        int price = TestDrillerPricing.getPricePerCopy(copies);
        int total = TestDrillerPricing.calculateTotalCost(copies);

        System.out.println("Number of copies: " + copies);
        System.out.println("Price per copy: ₦" + price);
        System.out.println("Total cost: ₦" + total);
    }
}