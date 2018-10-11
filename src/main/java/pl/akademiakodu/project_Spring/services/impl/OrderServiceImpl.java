package pl.akademiakodu.project_Spring.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.akademiakodu.project_Spring.model.Product;
import pl.akademiakodu.project_Spring.repository.ProductRepository;
import pl.akademiakodu.project_Spring.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void processOrder(String productId, int count) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < count) {
            throw new IllegalArgumentException("Zbyt mało towaru. Obecna liczba sztuk w magazynie: " + productById.getUnitsInStock());
        }

        productById.setUnitsInStock(productById.getUnitsInStock() - count);
    }
}
