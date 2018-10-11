package pl.akademiakodu.project_Spring.services;

import pl.akademiakodu.project_Spring.model.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    Product getProductById(String productID);
}
