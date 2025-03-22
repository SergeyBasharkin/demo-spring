package pro.sky.demospring.shop.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import pro.sky.demospring.shop.model.Product;
import pro.sky.demospring.shop.service.ProductService;

@RestController
@RequestMapping("/shop")
public class ShopController {

    private final ProductService productService;

    public ShopController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @PostMapping("/product")
    public Product add(@RequestBody Product product) {
       return productService.add(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/search")
    public List<Product> getProducts(@RequestParam("name") String name) {
        return productService.search(name);
    }
}
