/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
/**
 * Interface defining methods for product sales calculations.
 */
interface IProduct {
    int TotalSales(int[][] productSales);        // Method to calculate total sales
    double AverageSales(int[][] productSales);   // Method to calculate average sales
    int MaxSale(int[][] productSales);           // Method to find maximum sale
    int MinSale(int[][] productSales);           // Method to find minimum sale
}
