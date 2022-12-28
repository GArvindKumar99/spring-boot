package com.te.pcm.procatrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.pcm.procatentity.CategoriesEntity;

public interface CategoriesRepository extends JpaRepository<CategoriesEntity, Integer> {

}
