public class TestDrillerPricing {

    public static int getPricePerCopy(int copies) {
        if (copies >= 500) return 1000;
        else if (copies >= 200) return 1100;
        else if (copies >= 100) return 1200;
        else if (copies >= 50) return 1300;
        else if (copies >= 30) return 1500;
        else if (copies >= 10) return 1600;
        else if (copies >= 5) return 1800;
        else if (copies >= 1) return 2000;
        else return 0;
    }

    public static int calculateTotalCost(int copies) {
        return getPricePerCopy(copies) * copies;
    }
}