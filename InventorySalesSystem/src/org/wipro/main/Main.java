package org.wipro.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.wipro.model.Sales;
import org.wipro.model.SalesReport;
import org.wipro.model.Stock;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		Administration admin = new Administration();

		int choice = 0;

		do {
			System.out.println("1. Insert Stock");
			System.out.println("2. Delete Stock");
			System.out.println("3. Insert Sales");
			System.out.println("4. View Sales Report");
			System.out.print("Enter your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Stock stock = new Stock();
				System.out.println("Enter product ID: ");
				stock.setProductID(sc.nextLine());
				sc.nextLine();
				System.out.println("Enter product name: ");
				stock.setProductName(sc.next());
				System.out.println("Enter quantity on hand: ");
				stock.setQuantityOnHand(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter product unit price: ");
				stock.setProductUnitPrice(sc.nextDouble());
				System.out.println("Enter product reorder level: ");
				stock.setReorderLevel(sc.nextInt());
				sc.nextLine();
				admin.insertStock(stock);
				break;
			case 2:
				System.out.print("Enter product id to be deleted: ");
				sc.nextLine();
				String removeId = sc.nextLine();

				removeId = admin.deleteStock(removeId);

				if (removeId != null)
					System.out.println(removeId + " removed successfully");
				break;
			case 3:
				Sales sales = new Sales();
				System.out.print("Enter sales id: ");
				sc.nextLine();
				sales.setSalesID(sc.nextLine());
				// sc.nextLine();
				System.out.print("Enter date (dd-mm-yyyy): ");
				String sDate = sc.nextLine();
				Date date = new SimpleDateFormat("dd-mm-yyyy").parse(sDate);
				sales.setSalesDate(date);

				System.out.print("Enter product id: ");
				sales.setProductID(sc.nextLine());
				System.out.print("Enter quantity sold: ");
				sales.setQuantitySold(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter sales price per unit: ");
				sales.setSalesPricePerUnit(sc.nextDouble());
				String result = admin.insertSales(sales);
				System.out.print(result);
				break;
			case 4:
				ArrayList<SalesReport> list = admin.getSalesReport();
				for (SalesReport sl : list) {
					System.out.println();
					System.out.println("SalesId :: " + sl.getSalesID());
					System.out.println("ProductId :: " + sl.getProductID());
					System.out.println("Product Name :: " + sl.getProductName());
					System.out.println("Product Unit Price :: " + sl.getProductUnitPrice());
					System.out.println("Quantity Sold :: " + sl.getQuantitySold());
					System.out.println("Profit :: " + sl.getProfitAmount());
					System.out.println();
				}
				break;
			default:
				System.out.println("Exiting...");
				choice = 0;
				break;
			}
		} while (choice >= 1 && choice <= 4);

		sc.close();
	}

}