package pro.sky.demospring.shop.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pro.sky.demospring.shop.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public Product add(Product product){
        products.add(product);
        return product;
    }

    public List<Product> getProducts(){
        return products;
    }

    public List<Product> search(String name){
        return products.stream()
            .filter(product -> product.getName().contains(name))
            .toList();
    }
}
