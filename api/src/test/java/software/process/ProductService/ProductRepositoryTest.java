package software.process.ProductService;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import software.process.ProductService.Product;
import software.process.ProductService.ProductRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;


    @Test
    public void testFindAll() {
        //Arrange
        Product product = new Product();
        product.setId(1);
        product.setProductName("Helloworld Software Process I");

        //Act
        List<Product> products = productRepository.findAll();

        //Assert
        Assert.assertEquals(product.getId(), products.get(0).getId());
        Assert.assertEquals(product.getProductName(), products.get(0).getProductName());
    }
}
