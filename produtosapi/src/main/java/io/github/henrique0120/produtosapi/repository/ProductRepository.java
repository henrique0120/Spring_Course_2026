package io.github.henrique0120.produtosapi.repository;

import io.github.henrique0120.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name);

}
