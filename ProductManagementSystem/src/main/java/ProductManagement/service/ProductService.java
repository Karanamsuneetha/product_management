package ProductManagement.service;

import java.util.List;

import ProductManagement.entity.Product;

public interface ProductService {
	String addProduct(Product prod);
	String updateProduct(Product prod);
	String deleteProduct(Long prodId);
	String viewProduct(Long prodId);
	List<Product>viewAllProducts();
}
