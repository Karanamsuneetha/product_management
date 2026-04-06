package ProductManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProductManagement.entity.Product;

public interface ProductRepository extends JpaRepository <Product, Long> 
{
	

}
