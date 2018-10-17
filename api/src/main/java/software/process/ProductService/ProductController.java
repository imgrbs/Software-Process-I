package software.process.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return this.productRepository.findAll();
    }

    @GetMapping("/helloworld")
    public String getHello() {
        return "Helloworld Software Process I";
    }

}