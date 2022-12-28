package com.te.pcm.procatrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.pcm.procatentity.ProductEntity;

public interface ProductsRepository extends JpaRepository<ProductEntity, Integer> {

}
