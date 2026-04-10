package ProductManagement.service;

import java.util.List;

import ProductManagement.dto.ProductRequestdto;
import ProductManagement.entity.Product;

public interface ProductService {
	String addProduct(ProductRequestdto prod);
	String updateProduct(Product prod);
	String deleteProduct(Long prodId);
	Product viewProduct(Long prodId);
	List<Product>viewAllProducts();
}
