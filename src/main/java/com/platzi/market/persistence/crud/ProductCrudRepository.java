package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
    List<Product> findByIdCategoryOrderByNombreAsc(int idCategory);
    Optional<List<Product>> findByStockQuantityLessThanAndEstado(int stockQuantity, boolean state);
}
