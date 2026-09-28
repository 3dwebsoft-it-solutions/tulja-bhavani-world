package com.TuljaBhavaniWorld.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TuljaBhavaniWorld.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
