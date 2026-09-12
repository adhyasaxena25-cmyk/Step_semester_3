public class WarehouseInventoryBalancer {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int sectionATotal = 0;
        int sectionBTotal = 0;

        for (int quantity : sectionA) {
            sectionATotal += quantity;
        }

        for (int quantity : sectionB) {
            sectionBTotal += quantity;
        }

        String status;

        if (sectionATotal == sectionBTotal) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        int highestQuantity = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {

            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {

            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        System.out.println(
                "Section A Total: " + sectionATotal);

        System.out.println(
                "Section B Total: " + sectionBTotal);

        System.out.println("Status: " + status);

        System.out.println(
                "Highest Quantity: " + highestQuantity
                + " (" + highestSection
                + ", Item " + (highestIndex + 1) + ")");
    }

    public static void main(String[] args) {

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}
