package pl.akademiakodu.project_Spring.repository;

import pl.akademiakodu.project_Spring.model.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductRepository {
    List<Product> getAllProducts();
    List<Product> getProductByCategory(String category);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    Product getProductById(String productId);
}
