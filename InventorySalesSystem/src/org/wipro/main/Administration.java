package org.wipro.main;

import java.util.ArrayList;
import java.util.Date;

import org.wipro.dao.SalesDao;
import org.wipro.dao.StockDao;
import org.wipro.model.Sales;
import org.wipro.model.SalesReport;
import org.wipro.model.Stock;

public class Administration {
	private static StockDao stockDao = new StockDao();
	private static SalesDao salesDao = new SalesDao();

	public String insertStock(Stock stock) {
		if (stock != null && stock.getProductName().length() >= 2) {
			String productID = stockDao.generateProductID(stock.getProductName());
			stock.setProductID(productID);
			if (stockDao.insertStock(stock) == 1)
				return productID;
			else
				return "Data not Valid for insertion";
		} else {
			return "Data not Valid for insertion";
		}
	}

	public String deleteStock(String ProductID) {
		if (stockDao.deleteStock(ProductID) == 1)
			return "deleted";
		else
			return "record cannot be deleted";
	}

	public String insertSales(Sales sales) {
		if (sales == null)
			return "Object not valid for insertion";

		if (stockDao.getStock(sales.getProductID()) == null)
			return "Unknown Product for sales";

		if (stockDao.getStock(sales.getProductID()).getQuantityOnHand() < sales.getQuantitySold())
			return "Not enough stock on hand for sales";

//		if (sales.getSalesDate().before(new Date())) {
//			return "Invalid date";
//		}

		String salesID = salesDao.generateSalesID(sales.getSalesDate());
		sales.setSalesID(salesID);

		if (salesDao.insertSales(sales) == 1) {
			if (stockDao.updateStock(sales.getProductID(), sales.getQuantitySold()) == 1)
				return "sales record inserted successfully";
			else
				return "Error";
		} else {
			return "Error";
		}
	}

	public ArrayList<SalesReport> getSalesReport() {
		return salesDao.getSalesReport();
	}

}