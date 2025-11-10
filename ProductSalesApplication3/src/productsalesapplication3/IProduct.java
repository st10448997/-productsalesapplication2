/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package productsalesapplication3;

/**
 *
 * @author lab_services_student
 */
interface IProduct {
    int TotalSales(int[][] productSales);        // Method to calculate total sales
    double AverageSales(int[][] productSales);   // Method to calculate average sales
    int MaxSale(int[][] productSales);           // Method to find maximum sale
    int MinSale(int[][] productSales);  
    
}
