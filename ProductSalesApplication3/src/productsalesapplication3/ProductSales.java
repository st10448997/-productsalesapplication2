/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalesapplication3;

/**
 *
 * @author lab_services_student
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

    int TotalSales(int[][] salesData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

