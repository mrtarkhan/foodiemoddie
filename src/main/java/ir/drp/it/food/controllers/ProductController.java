package ir.drp.it.food.controllers;

import ir.drp.it.food.models.Product;
import ir.drp.it.food.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {


    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public Product get(@PathVariable int id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("the item not found"));
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Product item) {
        productRepository.save(item);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "{id}")
    public void edit(@RequestBody Product item, @PathVariable Integer id) {
        productRepository.findById(id)
                .map(product -> {
                    product.setName(item.getName());
                    product.setPrice(item.getPrice());
                    return productRepository.save(product);
                })
                .orElseGet(() -> productRepository.save(item));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    public void delete(@PathVariable Integer id) {
        productRepository.deleteById(id);
    }

}
