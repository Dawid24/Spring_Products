package pl.akademiakodu.project_Spring.repository;

import pl.akademiakodu.project_Spring.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
}
