package io.github.henrique0120.produtosapi.controller;

import io.github.henrique0120.produtosapi.model.Product;
import io.github.henrique0120.produtosapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        System.out.println("Produto recebido: " + product);

        var id = UUID.randomUUID().toString();
        product.setId(id);

        repository.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") String id){
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String id,
                       @RequestBody Product product){
        product.setId(id);
        repository.save(product);
    }

    @GetMapping
    public List<Product> search(@RequestParam("name") String name){
        return repository.findByName(name);
    }

}
