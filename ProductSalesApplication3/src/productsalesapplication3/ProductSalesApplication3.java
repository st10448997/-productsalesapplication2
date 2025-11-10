/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productsalesapplication3;

/**
 *
 * @author lab_services_student
 */
public class ProductSalesApplication3 {
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
        ProductSales ps;
        ps = new ProductSales();

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
