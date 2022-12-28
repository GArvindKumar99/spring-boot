package com.te.pcm.procatrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.pcm.procatentity.ProductEntity;
import com.te.pcm.procatentity.ProductVariationEntity;

public interface ProductVariationRepository extends JpaRepository<ProductVariationEntity, Integer> {


}
