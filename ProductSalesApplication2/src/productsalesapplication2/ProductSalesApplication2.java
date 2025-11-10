package productsalesapplication2;

/**
 * Interface defining methods for product sales calculations.
 */
interface IProduct {
    int TotalSales(int[][] productSales);
    double AverageSales(int[][] productSales);
    int MaxSale(int[][] productSales);
    int MinSale(int[][] productSales);
}

/**
 * Class implementing the IProduct interface to provide methods
 * for calculating total sales, average sales, max sale, and min sale.
 */
class ProductSales implements IProduct {

    // Method to calculate total sales
    public int TotalSales(int[][] productSales) {
        if (productSales == null || productSales.length == 0) {
            return 0;
        }
        
        int total = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }
        return total;
    }

    // Method to calculate average sales
    public double AverageSales(int[][] productSales) {
        if (productSales == null || productSales.length == 0) {
            return 0;
        }
        
        int total = TotalSales(productSales);
        int count = 0;

        for (int i = 0; i < productSales.length; i++) {
            count += productSales[i].length;
        }

        return count == 0 ? 0 : (double) total / count;
    }

    // Method to find the maximum sale
    public int MaxSale(int[][] productSales) {
        if (productSales == null || productSales.length == 0) {
            return Integer.MIN_VALUE; // Or throw an exception
        }

        int max = productSales[0][0];
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] > max) {
                    max = productSales[i][j];
                }
            }
        }
        return max;
    }

    // Method to find the minimum sale
    public int MinSale(int[][] productSales) {
        if (productSales == null || productSales.length == 0) {
            return Integer.MAX_VALUE; // Or throw an exception
        }

        int min = productSales[0][0];
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] < min) {
                    min = productSales[i][j];
                }
            }
        }
        return min;
    }
}

/**
 * Main class for running the Product Sales Report application.
 */
public class ProductSalesApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Two-dimensional array for sales data
        // Rows = Years, Columns = Quarters
        int[][] salesData = {
            {300, 150, 700},   // Year 1 (3 Quarters)
            {250, 200, 600}    // Year 2 (3 Quarters)
        };

        // Create an object of ProductSales to use its methods
        ProductSales ps = new ProductSales();

        // Calculate total, average, max, and min sales using the methods
        int total = ps.TotalSales(salesData);
        double average = ps.AverageSales(salesData);
        int max = ps.MaxSale(salesData);
        int min = ps.MinSale(salesData);

        // Display the sales report
        System.out.println("-------------------------------");
        System.out.println(" PRODUCT SALES REPORT - 2025");
        System.out.println("-------------------------------");
        System.out.println("Total sales:    " + total);
        System.out.printf("Average sales:  %.0f%n", average);
        System.out.println("Maximum sale:   " + max);
        System.out.println("Minimum sale:   " + min);
        System.out.println("-------------------------------");
    }
}
