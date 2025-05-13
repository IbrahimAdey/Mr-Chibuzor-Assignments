public class TableGenerator {

    public static void generateTable(int a, int b) {
        // Print the table header
        System.out.print("    ");
        for (int i = a; i <= b; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("    ");
        for (int i = a; i <= b; i++) {
            System.out.print("----");
        }
        System.out.println();

        // Print table rows
        for (int i = a; i <= b; i++) {
            System.out.printf("%2d |", i);
            for (int j = a; j <= b; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}